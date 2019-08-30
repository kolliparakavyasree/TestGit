var LoginTMS = /** @class */ (function () {
    function LoginTMS() {
        this.UserName = "";
        this.Password = "";
    }
    LoginTMS.prototype.login = function (UserName, Password) {
        console.log("User Validation:" + UserName);
        if (UserName == "Abc" && Password == "") {
            console.log("Logged into user Account");
        }
        else {
            console.log("Invalid Credentials..! Forgot Password?");
        }
    };
    LoginTMS.prototype.forgotPassword = function (UserName, Email) {
        console.log("Verify the user:" + UserName); // through email..!
        if (UserName == "Abc" && Email == "abc@xyz.com") {
            console.log("Allow user to set password");
        }
        else {
            console.log("Invalid Credentials..! New User?");
        }
        // this.userLogin();
    };
    LoginTMS.prototype.logout = function (UserName) {
        console.log(UserName + "User Logged out...!");
    };
    return LoginTMS;
}());
var u = new LoginTMS();
console.log(u.login("Abc", ""));
console.log(u.forgotPassword("Abc", "abc@xyz.com"));
console.log(u.logout("Abc"));
