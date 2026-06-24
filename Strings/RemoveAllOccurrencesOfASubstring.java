// remove all occurence

class RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            // means jab tk part is inside the s jabtk we have to run the loop
            int index = s.indexOf(part);
            // ye hume starting index dedega part ka if its exist 
            if(index != -1){
                // agr part exist krta h to use remove krna h and subtstring func use krte hue last wala index is not included inside the prt so make sure for that'
                s = s.substring(0, index) + s.substring(index + part.length());
            }

        }
        return s;
    }
}
