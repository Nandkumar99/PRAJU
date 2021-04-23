$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Clone job.feature");
formatter.feature({
  "line": 1,
  "name": "Clone job",
  "description": "",
  "id": "clone-job",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Clone functionality",
  "description": "",
  "id": "clone-job;clone-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "clone job",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "after clone close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CloneJob.clone_job()"
});
formatter.result({
  "duration": 23465614607,
  "status": "passed"
});
formatter.match({
  "location": "CloneJob.after_clone_job_close_browser()"
});
formatter.result({
  "duration": 15529,
  "status": "passed"
});
formatter.uri("Employer forgot password.feature");
formatter.feature({
  "line": 1,
  "name": "Forgot password",
  "description": "",
  "id": "forgot-password",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Forgot functionality",
  "description": "",
  "id": "forgot-password;forgot-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User should be on forgot password page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User forgot the password",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployerForgotPassword.user_should_be_on_forgot_password_page()"
});
formatter.result({
  "duration": 7417179282,
  "status": "passed"
});
formatter.match({
  "location": "EmployerForgotPassword.user_forgot_the_password()"
});
formatter.result({
  "duration": 180195971,
  "status": "passed"
});
formatter.uri("Post New Job.feature");
formatter.feature({
  "line": 1,
  "name": "Post the job",
  "description": "",
  "id": "post-the-job",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Post job functionality",
  "description": "",
  "id": "post-the-job;post-job-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "post new job",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Postnewjob.post_the_job()"
});
formatter.result({
  "duration": 5001894073,
  "error_message": "java.lang.NullPointerException\n\tat Steps.Postnewjob.post_the_job(Postnewjob.java:25)\n\tat ✽.Given post new job(Post New Job.feature:3)\n",
  "status": "failed"
});
formatter.match({
  "location": "Postnewjob.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Veryfyl Registration",
  "description": "",
  "id": "veryfyl-registration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Veryfyl Registration Functionality",
  "description": "",
  "id": "veryfyl-registration;veryfyl-registration-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open veryfyl registration page",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "I complate veryfyl Registration",
  "keyword": "Then "
});
formatter.match({
  "location": "registration.I_open_veryfyl_page()"
});
formatter.result({
  "duration": 11304713285,
  "status": "passed"
});
formatter.match({
  "location": "registration.I_complate_veryfyl_Registration()"
});
formatter.result({
  "duration": 20863866458,
  "status": "passed"
});
formatter.uri("VeryFylLogin.feature");
formatter.feature({
  "line": 1,
  "name": "VeryFyl Login",
  "description": "",
  "id": "veryfyl-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "VeryFyl Login Functionality",
  "description": "",
  "id": "veryfyl-login;veryfyl-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I open VeryFyl Login page",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "I Open VeryFyl Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "VeryFylLogin.i_open_very_fyl_login_page()"
});
formatter.result({
  "duration": 8130009333,
  "status": "passed"
});
formatter.match({
  "location": "VeryFylLogin.i_open_very_fyl_home_page()"
});
formatter.result({
  "duration": 10395176935,
  "status": "passed"
});
formatter.match({
  "location": "VeryFylLogin.close_browser()"
});
formatter.result({
  "duration": 139794063,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Premium Employer Login",
  "description": "",
  "id": "veryfyl-login;premium-employer-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I open premium login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter Id And Password",
  "keyword": "Then "
});
formatter.match({
  "location": "VeryFylLogin.i_open_premium_login_page()"
});
formatter.result({
  "duration": 5874353062,
  "status": "passed"
});
formatter.match({
  "location": "VeryFylLogin.enter_Id_And_Password()"
});
formatter.result({
  "duration": 537296509,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Jobseeker Login through Google",
  "description": "",
  "id": "veryfyl-login;jobseeker-login-through-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I open Jobbseeker Linkedin login",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Enter Linkden userid and password",
  "keyword": "Then "
});
formatter.match({
  "location": "VeryFylLogin.i_open_Jobbseeker_Linkedin_login()"
});
formatter.result({
  "duration": 2763545409,
  "status": "passed"
});
formatter.match({
  "location": "VeryFylLogin.enter_Linkden_userid_and_password()"
});
formatter.result({
  "duration": 10824890477,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Jobseeker Login through Linkedin",
  "description": "",
  "id": "veryfyl-login;jobseeker-login-through-linkedin",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I open Jobseeker google login",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Enter google userid and password",
  "keyword": "Then "
});
formatter.match({
  "location": "VeryFylLogin.i_open_Jobseeker_google_login()"
});
formatter.result({
  "duration": 4340727753,
  "status": "passed"
});
formatter.match({
  "location": "VeryFylLogin.enter_google_userid_and_password()"
});
formatter.result({
  "duration": 8248652826,
  "status": "passed"
});
});