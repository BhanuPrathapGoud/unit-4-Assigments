package com.question1;

public class Mobile {
    public static String[] outdatedModels = {"note4","note5","note6","note7"};
    public void searchOutdatedModel(String... modelName){

        for (int i = 0 ; i < modelName.length ; i++){
            boolean check = false;
            for (int j = 0 ; j < outdatedModels.length ; j++){
                if (modelName[i] == outdatedModels[j]){
                    check = true;
                }
            }
            if (check){
                System.out.println(modelName[i]+"_OUTDATED");
            }else {
                System.out.println(modelName[i]+"_UPDATED");
            }
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.searchOutdatedModel("not34","note7","note8");
    }
}
