function computeAge() {
   
	// get the value of the birthdate field by id
    var birthDateField = document.getElementById('birthdate').value;
        
    // convert the value of the birthDateField into javascript Date object
    var birthday = new Date(birthDateField);
    
    // get the age value. the result is in ms. and then we parse to int so that we get an exact integer
    var ageValue = parseInt(((Date.now() - birthday) / (31557600000))); // 1 year is 31557600000 ms
    
    // get the HTML age field
    var ageField = document.getElementById('age');
    
    // set the computed age value into the age field
    ageField.value = ageValue;
}