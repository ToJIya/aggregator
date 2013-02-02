package com.myproject.web.pages;

import com.myproject.common.dto.UserDto;
import com.myproject.database.service.UserService;
import com.myproject.web.converter.UserConverter;
import com.myproject.web.panels.UsersPanel;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

/**
 * @author Anatoly Selitsky
 */
public class HomePage extends WebPage {

    @SpringBean
    private UserService userService;

    @SpringBean
    private UserConverter userConverter;

    private UserDto userDto = new UserDto();

    private String email;

    public HomePage(final PageParameters parameters) {
        super(parameters);

        FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
        feedbackPanel.setOutputMarkupId(true);
        add(feedbackPanel);

        final UsersPanel usersPanel = new UsersPanel("userPanel");
        add(usersPanel);

        final TextField<String> username = new TextField<String>("username");
        username.setOutputMarkupId(true);
        username.setRequired(true);

        final TextField<String> firstName = new TextField<String>("firstName");
        firstName.setOutputMarkupId(true);
        firstName.setRequired(true);

        final TextField<String> lastName = new TextField<String>("lastName");
        lastName.setOutputMarkupId(true);
        lastName.setRequired(true);

        final TextField<Integer> age = new TextField<Integer>("age");
        age.setOutputMarkupId(true);
        age.setRequired(true);

        Form<UserDto> form = new Form<UserDto>("createUser", new CompoundPropertyModel<UserDto>(userDto)) {

            protected void onSubmit() {
                userService.save(userConverter.toDomain(userDto));
                usersPanel.updateListView();
            }

        };

        add(form);
        form.add(username);
        form.add(firstName);
        form.add(lastName);
        form.add(age);


        final TextField<String> email = new TextField<String>("email", new PropertyModel<String>(this, "email"));

        Form<?> test = new Form<Void>("testForm") {
            protected void onSubmit() {
                info("email" + email.getInput());
            }
        };
        add(test);
        test.add(email);

    }

}
