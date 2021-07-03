public enum Season {
    SUMMER(40), WINTER(-35), AUTUMN(15), SPRING(20);

    private int temperature;
    Season(int temperature){
        this.temperature=temperature;
    }
    public int getTemperature(){
        return temperature;}
    }
