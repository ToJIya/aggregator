package com.myproject.web.panels;

import com.myproject.database.domain.User;
import com.myproject.database.service.UserService;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import java.util.List;

/**
 * @author Anatoly Selitsky
 */
public class UsersPanel extends Panel {

    @SpringBean
    private UserService userService;

    private ListView<User> listView;

    public UsersPanel(String id) {
        super(id);

        List<User> users = userService.fetchAllUser();

        listView = new ListView<User>("users", users) {
            @Override
            protected void populateItem(ListItem<User> item) {
                final User user = item.getModelObject();
                item.add(new Label("id", user.getId() + ""));
                item.add(new Label("username", user.getUsername()));
            }
        };

        add(listView);
    }

    public void updateListView() {
        List<User> users = userService.fetchAllUser();
        listView.setList(users);
    }

}
