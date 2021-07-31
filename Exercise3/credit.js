function paymentValidation() {
  const cardno = document.pay.cardnumber;
  const cvvno = document.pay.cvv;
  const otpstr = document.pay.otp;
  const amt = document.pay.amount;

  if (
    cardnumber_validation(cardno, 16) &&
    cvv_validation(cvvno, 3) &&
    otp_validation(otpstr, 8) &&
    amt_validation(amt, 50000)
  ) {
    payment();
    return true;
  }
  return false;
}

function cardnumber_validation(cardno) {
  const cardno_len = cardno.value.length;
  if (cardno_len == 0 || cardno_len > 16 || cardno_len < 16) {
    alert("cardno_ should not be empty / length should be 16 ");
    cardno.focus();
    return false;
  }
  return true;
}

function cvv_validation(cvv) {
  const cvv_len = cvv.value.length;
  if (cvv_len == 0 || cvv_len > 3 || cvv_len < 3) {
    alert("cvv should not be empty / length should be 3");
    cvv.focus();
    return false;
  }
  return true;
}

function otp_validation(otpstr) {
  const letters = /[0-9]{5}$/;
  if (otpstr.value.match(letters)) {
    return true;
  } else {
    alert("OTP must have numeric characters only");
    otpstr.focus();
    return false;
  }
}

function amt_validation(amount) {
  if (amount <= 0 || amount > 50000) {
    alert("amount should not be empty / greater than 50000");
    sum.focus();
    return false;
  }
  return true;
}

function payment() {
  document.getElementById("demo1").innerHTML = "PAYMENT SUCCESSFUL";
}
