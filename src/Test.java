public class Test {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.getTemperature());
    switch (season){
        case AUTUMN:
            System.out.println("this autumn");
            break;
        case SPRING:
            System.out.println("this spring");
    }
    }


}
