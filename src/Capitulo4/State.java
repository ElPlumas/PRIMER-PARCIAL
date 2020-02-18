package Capitulo4;

public class State {
    
    private class City {

        private String name;
        private Integer population;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }
        
    }
   
    private String name;
    private Integer population;
    private City capitalCity = new City();
    private City mostPopulous = new City();

    public State(String name, Integer population, String capitalCity, Integer capitalPopulation, String mostPopulousCity, Integer biggestPopulation) {
        this.capitalCity.setName(capitalCity);
        this.mostPopulous.setName(mostPopulousCity);
        this.capitalCity.setPopulation(capitalPopulation);
        this.mostPopulous.setPopulation(biggestPopulation);
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void printCapitalCity() {
        System.out.println("\tCapital city: " + this.capitalCity.getName() +
                "\n\t Population: " + this.capitalCity.getPopulation());
    }

    public void printMostPopulous() {
        System.out.println("\tMost populous city: " + this.mostPopulous.getName() +
                "\n\t Population: " + this.mostPopulous.getPopulation());
    }
    
    
    public static void main(String[] args) {
        
        State state = new State("New York", 8398748, "Albany", 97279, "Syracuse", 142749);
        
        System.out.println("State: " + state.getName()  +
                "\nPopulation: " + state.getPopulation());
        state.printCapitalCity();
        state.printMostPopulous();
        
    }
    
}
