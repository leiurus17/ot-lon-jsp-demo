function validateField(value, errorMessageFieldName, validationType) {
	
	const ALPHABET = "ALPHABET";
	const NUMERIC = "NUMERIC";
	const ALPHA_NUMERIC = "ALPHA_NUMERIC";

	if (validationType === ALPHABET) {
		showErrorMessageField(/^[a-zA-Z]*$/.test(value), errorMessageFieldName);
	} else if (validationType === NUMERIC) {
		showErrorMessageField(/^[0-9]*$/.test(value), errorMessageFieldName);
	} else if (validationType === ALPHA_NUMERIC) {
		showErrorMessageField(/^[a-zA-Z0-9]*$/.test(value), errorMessageFieldName);
	}
}

function showErrorMessageField(isShow, errorMessageFieldName) {
	if (!isShow) {
		document.getElementById(errorMessageFieldName).style.display = "block";
	} else {
		document.getElementById(errorMessageFieldName).style.display = "none";
	}
}

function checkFieldsIfNoError() {
	
	var errorFieldNames = ["first_name_error", "last_name_error", "age_error", "city_error", "mobile_number_error"];
	
	var isProceed = true;
	
	for (var i = 0; i < errorFieldNames.length; i++) {
		if (document.getElementById(errorFieldNames[i]).style.display === "block") {
			isProceed = false;
			break;
		}
	}
	
	if (!isProceed) {
		alert("Please check the fields with error.");
	}
	
	
	return isProceed;
}

function checkGenderIfSelected() {
	
}