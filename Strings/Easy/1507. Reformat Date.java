class Solution {
    public String reformatDate(String date) {
        
        //HashMap<String, String> month = new HashMap<>();
        String finalDate = "";
        String[] dateParts = date.split(" ");
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String dpDate = dateParts[0];
        String dpMonth = dateParts[1];
        String dpYear = dateParts[2];

        finalDate = dpYear + "-";

        for(int i = 0; i < 12; i++){
            if(month[i].equals(dpMonth) && i+1 < 10){

                finalDate += "0" + Integer.toString(i+1);
                break;
            }
            if(month[i].equals(dpMonth) && i+1 >= 10){
                finalDate += Integer.toString(i+1);
                break;
            }
        }

        if(dpDate.length() == 4){
            finalDate += "-" + dpDate.substring(0, 2);
        }
        else{
            finalDate += "-0" + dpDate.substring(0, 1);
        }

        return finalDate;

        // month.put("Jan", "01");
        // month.put("Feb", "02");
        // month.put("Mar", "03");
        // month.put("Apr", "04");
        // month.put("May", "05");
        // month.put("Jun", "06");
        // month.put("Jul", "07");
        // month.put("Aug", "08");
        // month.put("Sep", "09");
        // month.put("Oct", "10");
        // month.put("Nov", "11");
        // month.put("Dec", "12");
        

        // finalDate = date.substring(date.length()-4) + "-" + month.get(date.substring(date.length()-8, date.length()-5)) + "-";

        // int dateLength = date.indexOf(" ");
        // if(dateLength % 2 == 0){
        //     finalDate += date.substring(0, dateLength-2);
        // }
        // else{
        //     finalDate += "0" + date.substring(0, dateLength-2);
        // }

        // return finalDate;
    }
}
