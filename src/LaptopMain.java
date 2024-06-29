import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;


public class LaptopMain {
    public static void filterLaptops(Set <Laptop> hs) {

        Map<Integer, String> brandMap = new HashMap<>();
        brandMap.put(1, "Lenovo");
        brandMap.put(2, "ASUS");
        brandMap.put(3, "Dell");

        Map<Integer, Double> screenSizeMap = new HashMap<>();
        screenSizeMap.put(1, 13.9);
        screenSizeMap.put(2, 14.0);
        screenSizeMap.put(3, 15.6);
        screenSizeMap.put(4, 16.0);
        screenSizeMap.put(5, 17.3);

        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(1, "серый");
        colorMap.put(2, "черный");

        Map<Integer, Integer> hardDiskSizeMap = new HashMap<>();
        hardDiskSizeMap.put(1, 256);
        hardDiskSizeMap.put(2, 512);
        hardDiskSizeMap.put(3, 1024);

        Map<Integer, String> cpuMap = new HashMap<>();
        cpuMap.put(1, "AMD Radeon 610M");
        cpuMap.put(2, "Intel Core i3-1115G4");
        cpuMap.put(3, "Intel Processor N200");
        cpuMap.put(4, "Intel Core i7");

        Map<Integer, String> osMap = new HashMap<>();
        osMap.put(1, "без ОС");
        osMap.put(2, "Windows 11");
        osMap.put(3, "Windows 10");
        osMap.put(4, "Linux");
        osMap.put(5, "macOS");

        Map<Integer, Integer> ramMap = new HashMap<>();
        ramMap.put(1, 4);
        ramMap.put(2, 8);
        ramMap.put(3, 16);
        ramMap.put(4, 32);
        ramMap.put(5, 64);

        Map<Integer, String> graphCardMap = new HashMap<>();
        graphCardMap.put(1, "AMD Radeon 610M");
        graphCardMap.put(2, "Intel UHD Graphics");

        Map<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 35000);
        priceMap.put(2, 40000);
        priceMap.put(3, 45000);

        System.out.println("Введите цифру, соответствующую нужному критерию: " + System.lineSeparator());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Производитель");
        map.put(2, "Диагональ экрана (дюйм)");
        map.put(3, "Цвет");
        map.put(4, "Объем жесткого диска(Гб)");
        map.put(5, "Тип процессора");
        map.put(6, "Операционная система");
        map.put(7, "Объем оперативной памяти (Гб)");
        map.put(8, "Тип видеокарты");
        map.put(9, "Цена (руб)");

        for (int i = 1; i < map.size() + 1; i++) {
            System.out.print(i);
            System.out.println(" " + map.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        int filter1 = scanner.nextInt();

        switch (filter1) {
            case 1:
                System.out.println("Введите цифру, соответствующую производителю");
                for (int i = 1; i < brandMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + brandMap.get(i));
                }
                int brand = scanner.nextInt();

                System.out.println(System.lineSeparator() + "Все ноутбуки, у которых производитель - " + brandMap.get(brand) + System.lineSeparator());

                boolean isExist1 = false;
                for (Laptop laptop: hs){
                    if(laptop.getBrand().equals(brandMap.get(brand))){
                        System.out.println(laptop.toString());
                        isExist1 = true;
                    }
                }

                if(!isExist1){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }

                break;

            case 2:
                System.out.println("Введите цифру, соответствующую минимальной диагонали экрана");
                for (int i = 1; i < screenSizeMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + screenSizeMap.get(i)+"\"");
                }
                int screenSize = scanner.nextInt();

                System.out.println(System.lineSeparator() +
                        "Все ноутбуки, у которых диагональ экрана равна или больше, чем "
                        + screenSizeMap.get(screenSize) + System.lineSeparator());
                boolean isExist2 = false;
                for (Laptop laptop: hs){
                    if(laptop.getScreenSize() >= (screenSizeMap.get(screenSize))){
                        System.out.println(laptop.toString());
                        isExist2 = true;
                    }
                }
                if(!isExist2){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 3:
                System.out.println("Введите цифру, соответствующую цвету");
                for (int i = 1; i < colorMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + colorMap.get(i));
                }
                int color = scanner.nextInt();

                System.out.println(System.lineSeparator() + "Все ноутбуки, у которых цвет - " + colorMap.get(color) + System.lineSeparator());

                boolean isExist3 = false;
                for (Laptop laptop: hs){
                    if(laptop.getColor().equals(colorMap.get(color))){
                        System.out.println(laptop.toString());
                        isExist3=true;
                    }
                }
                if(!isExist3){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 4:
                System.out.println("Введите цифру, соответствующую минимальному объему жесткого диска");
                for (int i = 1; i < hardDiskSizeMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + hardDiskSizeMap.get(i)+" Гб");
                }
                int hds = scanner.nextInt();

                System.out.println(System.lineSeparator() +
                        "Все ноутбуки, у которых объем жесткого диска равен или больше, чем "
                        + hardDiskSizeMap.get(hds) + " Гб" + System.lineSeparator());
                boolean isExist4 = false;
                for (Laptop laptop: hs){
                    if(laptop.getHardDiscSize() >= (hardDiskSizeMap.get(hds))){
                        System.out.println(laptop.toString());
                        isExist4=true;
                    }
                }
                if(!isExist4){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 5:
                System.out.println("Введите цифру, соответствующую типу процессора");
                for (int i = 1; i < cpuMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + cpuMap.get(i));
                }
                int cpu = scanner.nextInt();

                System.out.println(System.lineSeparator() + "Все ноутбуки, у которых тип процессора - "
                        + cpuMap.get(cpu) + System.lineSeparator());
                boolean isExist5 = true;
                for (Laptop laptop: hs){
                    if(laptop.getCpuModel().equals(cpuMap.get(cpu))){
                        System.out.println(laptop.toString());
                    }
                }
                if(!isExist5){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 6:
                System.out.println("Введите цифру, соответствующую операционной системе");
                for (int i = 1; i < osMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + osMap.get(i));
                }
                int os = scanner.nextInt();

                System.out.println(System.lineSeparator() + "Все ноутбуки, у которых тип ОС - "
                        + osMap.get(os) + System.lineSeparator());
                boolean isExist6 = true;
                for (Laptop laptop: hs){
                    if(laptop.getOperatingSystem().equals(osMap.get(os))){
                        System.out.println(laptop.toString());
                        isExist6 = false;
                    }
                }
                if(!isExist6){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 7:
                System.out.println("Введите цифру, соответствующую минимальному объему оперативной памяти");
                for (int i = 1; i < ramMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + ramMap.get(i)+"Гб");
                }

                int ram = scanner.nextInt();

                System.out.println(System.lineSeparator() +
                        "Все ноутбуки, у которых объем оперативной памяти равен или больше, чем "
                        + ramMap.get(ram) + " Гб" + System.lineSeparator());
                boolean isExist7=false;
                for (Laptop laptop: hs){
                    if(laptop.getRamMemorySize() >= (ramMap.get(ram))){
                        System.out.println(laptop.toString());
                        isExist7=true;
                    }
                }
                if(!isExist7){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 8:
                System.out.println("Введите цифру, соответствующую типу видеокарты");
                for (int i = 1; i < graphCardMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + graphCardMap.get(i));
                }
                int gr = scanner.nextInt();

                System.out.println(System.lineSeparator() + "Все ноутбуки, у которых тип видеокарты - "
                        + graphCardMap.get(gr) + System.lineSeparator());
                boolean isExist8 = false;
                for (Laptop laptop: hs){
                    if(laptop.getGraphicsCard().equals(graphCardMap.get(gr))){
                        System.out.println(laptop.toString());
                        isExist8 = true;
                    }
                }
                if(!isExist8){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            case 9:
                System.out.println("Введите цифру, соответствующую минимальной цене");
                for (int i = 1; i < priceMap.size() + 1; i++) {
                    System.out.print(i);
                    System.out.println(" <-- " + priceMap.get(i)+ " руб.");
                }
                int pr = scanner.nextInt();

                System.out.println(System.lineSeparator() +
                        "Все ноутбуки, у которых цена равна или выше, чем "
                        + priceMap.get(pr) + " руб." + System.lineSeparator());
                boolean isExist9 = false;
                for (Laptop laptop: hs){
                    if(laptop.getPrice() >= (priceMap.get(pr))){
                        System.out.println(laptop.toString());
                        isExist9 = true;
                    }
                }
                if(!isExist9){
                    System.out.println("Ноутбуков, подходящих под заданные условия, не найдено.");
                }
                break;

            default:
                System.out.println("Проверьте правильность написания. Введите цифру от 1 до 9, соответствующую нужному критерию");
                break;

        } //switch закрыли

        scanner.close();
    }


    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(
                "Lenovo",
                "Lenovo V15 G4 AMN",
                15.6,
                "серый",
                128,
                "AMD Athlon Silver 712 OV",
                "без ОС",
                8,
                "AMD Radeon 610M",
                45000);

        Laptop laptop2 = new Laptop(
                "ASUS",
                "ASUS ExpertBook B1 B1502CGA-BQ0081",
                15.6,
                "серый",
                128,
                "Intel Processor N200",
                "Windows 11 Home",
                4,
                "Intel UHD Graphics",
                35000);

        Laptop laptop3 = new Laptop(
                "ASUS",
                "ASUS ExpertBook B1 B1502CGA-BQ0081",
                15.6,
                "серый",
                128,
                "Intel Processor N200",
                "Windows 11 Home",
                4,
                "Intel UHD Graphics",
                35000);

        Laptop laptop4 = new Laptop(
                "Dell",
                "Dell Vostro 3500-5629",
                15.6,
                "черный",
                256,
                "Intel Core i3-1115G4",
                "Linux",
                4,
                "Intel UHD Graphics",
                40000);

        Laptop laptop5 = new Laptop(
                "Dell",
                "Dell Vostro 3500-5629",
                15.6,
                "черный",
                256,
                "Intel Core i3-1115G4",
                "Linux",
                4,
                "Intel UHD Graphics",
                40000);

        Laptop laptop6 = new Laptop(
                "Lenovo",
                "Lenovo ThinkBook",
                13.9,
                "серый",
                512,
                "Intel Core i7",
                "Windows 10",
                16,
                "Intel UHD Graphics",
                35000);

        Laptop laptop7 = new Laptop(
                "ASUS",
                "ASUS Zenbook 14 OLED (UM3406)",
                14.0,
                "серый",
                512,
                "Intel Core i7",
                "Windows 11",
                16,
                "AMD Radeon 610M",
                35000);

        Laptop laptop8 = new Laptop(
                "ASUS",
                "ASUS Vivobook Go15",
                16.0,
                "серый",
                512,
                "Intel Core i7",
                "Windows 11",
                16,
                "AMD Radeon 610M",
                55000);


        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8));

        filterLaptops(laptops);
    }
}

