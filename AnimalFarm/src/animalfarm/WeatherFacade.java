package animalfarm;

/**
 *
 * @author User
 */
public class WeatherFacade {
    Farm farm;
    String weather;

    public WeatherFacade(Farm farm, String weather) {
        this.farm = farm;
    }
    
    public void start(){
        for(int row=0; row<farm.getFarm().length; row++){
            for (int col=0; col<farm.getFarm()[row].length; col++){
                if(farm.getFarm()[row][col].equals("grass")){
                    farm.setElement("grass", col, row);
                }
            }
        }
    }

}
