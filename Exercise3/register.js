function formValidation() {
  const {
    userid,
    passid,
    username,
    address,
    country,
    zip,
    email,
    mgender,
    fgender,
  } = document.registration;
  if (
    userid_validation(userid, 5, 12) &&
    passid_validation(passid, 7, 12) &&
    allLetter(username) &&
    alphanumeric(address) &&
    countryselect(country) &&
    allnumeric(zip) &&
    ValidateEmail(email) &&
    validgender(mgender, fgender)
  ) {
    alert("Validation successful");
    window.location.reload();
  }

  return false;
}

function userid_validation(uid, mx, my) {
  const uid_len = uid.value.length;
  if (uid_len == 0 || uid_len >= my || uid_len < mx) {
    alert(
      "User Id should not be empty / length be between " + mx + " to " + my
    );
    uid.focus();
    return false;
  }
  return true;
}

function passid_validation(passid, mx, my) {
  const passid_len = passid.value.length;
  if (passid_len == 0 || passid_len >= my || passid_len < mx) {
    alert(
      "Password should not be empty / length be between " + mx + " to " + my
    );
    passid.focus();
    return false;
  }
  return true;
}

function allLetter(uname) {
  if (uname.value.match(/^[A-Za-z]+$/)) {
    return true;
  } else {
    alert("Username must have alphabet characters only");
    uname.focus();
    return false;
  }
}

function alphanumeric(uadd) {
  if (uadd.value.match(/^[0-9a-zA-Z]+$/)) {
    return true;
  } else {
    alert("User address must have alphanumeric characters only");
    uadd.focus();
    return false;
  }
}

function countryselect(ucountry) {
  if (ucountry.value == "Default") {
    alert("Select your country from the list");
    ucountry.focus();
    return false;
  } else {
    return true;
  }
}

function allnumeric(uzip) {
  if (uzip.value.match(/^[0-9]+$/)) {
    return true;
  } else {
    alert("ZIP code must have numeric characters only");
    uzip.focus();
    return false;
  }
}

function ValidateEmail(uemail) {
  const mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if (uemail.value.match(mailformat)) {
    return true;
  } else {
    alert("You have entered an invalid email address!");
    uemail.focus();
    return false;
  }
}

function validgender(umgender, ufgender) {
  let x = 0;

  if (umgender.checked) {
    x++;
  }
  if (ufgender.checked) {
    x++;
  }
  if (x == 0) {
    alert("Select Male/Female");
    umgender.focus();
    return false;
  } else {
    return true;
  }
}

//Print Button
function showInput(params) {
  document.getElementById("display").innerHTML = params;

  return true;
}

function CopyElem() {
  let params = "",
    dummy;
  for (const i = 0; i < document.registration.elements.length; i++) {
    const fieldType = document.registration.elements[i].type;
    const fieldName = document.registration.elements[i].name;
    const fieldValue = document.registration.elements[i].value;
    const x = document.registration.elements[i].checked;
    if (x) {
      if (i == 7 || i == 8 || i == 9 || i == 10)
        params += fieldValue + "  " + "<br>";
    }

    if (i == 0 || i == 1 || i == 12 || i == 13) params = params;
    else if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 11)
      params += fieldValue + "  " + "<br>";
    else dummy = params;
  }

  showInput(params);
}