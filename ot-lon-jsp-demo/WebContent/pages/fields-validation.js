function validateField(value, errorMessageFieldName, validationType) {
	
	const ALPHABET = "ALPHABET";
	const NUMERIC = "NUMERIC";
	const ALPHA_NUMERIC = "ALPHA_NUMERIC";

	if (validationType === ALPHABET) {
		showErrorMessageField(/^[a-zA-Z]*$/.test(value), errorMessageFieldName);
	} else if (validationType === NUMERIC) {
		showErrorMessageField(/^[0-9]*$/.test(value), errorMessageFieldName);
	} else if (validationType === ALPHA_NUMERIC) {
		showErrorMessageField(/^[a-zA-Z0-9]*$/.test(value), errorMessageFieldName)
	}
}

function showErrorMessageField(isShow, errorMessageFieldName) {
	if (!isShow) {
		document.getElementById(errorMessageFieldName).style.display = "block";
	} else {
		document.getElementById(errorMessageFieldName).style.display = "none";
	}
}