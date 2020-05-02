public class MainClass {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast menu", "Breakfast");
        MenuComponent lunchMenu = new Menu("Tandoori", "Lunch");
        MenuComponent dinnerMenu = new Menu("South Indian", "Dinner");

        MenuComponent allMenus = new Menu("All menus", "All menu combined together");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        MenuComponent boiledEgg = new MenuItem("Boiled Egg", "Boiled white egg", "10", false);
        MenuComponent pannerTikka = new MenuItem("Panner Tikka", "Spicy cottage cheese tikka", "110", true);

        breakfastMenu.add(boiledEgg);
        lunchMenu.add(pannerTikka);

        allMenus.print();
    }
}
