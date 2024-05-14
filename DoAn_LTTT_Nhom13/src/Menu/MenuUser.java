package Menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import net.miginfocom.swing.*;

public class MenuUser extends JComponent {

    private MenuEvent menuEvent;
    private MigLayout layout;
    private String[][] menuItems = new String[][]{
        {"Thông Tin Công Dân"},
        {"Công Dân", "Khai Sinh", "Hộ Khẩu", "Tạm Trú", "Tạm Vắng", "Giấy Chứng Nhận Kết Hôn", "Đơn Ly Hôn"},
        {"Đánh Giá"}
    };

    private ImageIcon[] mainMenuIcons = new ImageIcon[]{
        new ImageIcon(getClass().getResource("/Image/home-circle-outline-custom.png")),
        new ImageIcon(getClass().getResource("/Image/account-circle-outline-custom.png")),
        new ImageIcon(getClass().getResource("/Image/star-circle-outline-custom.png"))
    };
    
     private ImageIcon[][] subMenuIcons = new ImageIcon[][]{
        {},
        {
            new ImageIcon(getClass().getResource("/Image/card-account-details-outline-custom.png")),
            new ImageIcon(getClass().getResource("/Image/baby-carriage-custom.png")),
            new ImageIcon(getClass().getResource("/Image/home-city-outline-custom.png")),
            new ImageIcon(getClass().getResource("/Image/home-import-outline-custom.png")),
            new ImageIcon(getClass().getResource("/Image/home-export-outline-custom.png")),
            new ImageIcon(getClass().getResource("/Image/notebook-heart-outline-custom.png")),
            new ImageIcon(getClass().getResource("/Image/heart-minus-outline-custom.png")),
        },
        {}
    };
    public MenuUser() {
        init();
    }

    public MenuEvent getMenuEvent() {
        return menuEvent;
    }

    public void setMenuEvent(MenuEvent menuEvent) {
        this.menuEvent = menuEvent;
    }

    private void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0,inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i, mainMenuIcons[i]);

        }
    }

    private void addMenu(String menuName, int index, ImageIcon icon) {
        int length = menuItems[index].length;
        MenuItems item = new MenuItems(menuName, index, length > 1, icon );
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        hideMenu(item, index);
                        item.setSelected(false);
                    }

                } else {
                    if (menuEvent != null) {
                        menuEvent.selected(index, 0);
                    }
                }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItems item, int index, int length, int indexZoder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setOpaque(false);
        for (int i = 1; i < length; i++) {
            MenuItems subItems = new MenuItems(menuItems[index][i], i, false, subMenuIcons[index][i - 1]);
            subItems.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (menuEvent != null) {
                        menuEvent.selected(index, subItems.getIndex());
                    }
                }
            }
            );
            subItems.initSubMenu(i, length);
            panel.add(subItems);
        }

        add(panel,
                "h 0!", indexZoder + 1);
        revalidate();

        repaint();

        MenuAnimation.showMenu(panel, item, layout,
                true);
    }

    private void hideMenu(MenuItems item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(21, 110, 71));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(g);
    }

}
