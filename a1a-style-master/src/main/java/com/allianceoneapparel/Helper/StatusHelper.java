package com.allianceoneapparel.Helper;

public class StatusHelper {
    public String responseHelper(int number, int action) {
        String response = "";
        switch (number) {
            case 1:
                if (action == 2)
                    response = "Update Completed !";
                else response = "Insert Completed !";
                break;
            case -10:
                response = "StyleMasterCode exist in system !";
                break;
            case -20:
                if (action == 2)
                    response = "StyleMasterCode, Season, Stage, OptionNo  existed in system !";
                break;
            default:
                response = "Error !";
                break;
        }
        return response;
    }
}
