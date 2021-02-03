package check;

import constants.Constants;

public class Check {

    private String firstName = "七條";
    private String lirstName = "遼介";

    private void printname(String firstName, String lastName) {
        System.out.println("printNameメソッド → " + this.firstName + this.lirstName);

    }

    public static void main(String[] args) {

        Check check = new Check();
        check.printname(check.firstName, check.lirstName);
        Constants constants = new Constants();
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();

    }

}
