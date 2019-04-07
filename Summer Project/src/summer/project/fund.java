/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer.project;

/**
 *
 * @author Amir Ahsan
 */
public class fund {
    
    private String name,fhname,email,desig,work_under,station,dep,do_appoint,do_ret,rate_pay,do_app,rswithdrawl,final_temp,do_sanc,contact;
    private double bill_unit,amt_avail,amt_per,amt_app,amt_sanc;

    public fund(){
        this.name="";
        this.fhname="";
        this.email="";
        this.desig="";
        this.work_under="";
        this.station="";
        this.dep="";
        this.do_appoint="";
        this.do_ret="";
        this.rate_pay="";
        this.do_app="";
        this.rswithdrawl="";
        this.final_temp="";
        this.do_sanc="";
         this.bill_unit=0.0;
         this.amt_avail=0.0;
         this.amt_per=0.0;
         this.amt_app=0.0;
         this.amt_sanc=0.0;
        this.contact="";
    }
    
    public fund(String name, String fhname, String email, String desig, String work_under, String station, String dep, String do_appoint, String do_ret, String rate_pay, String do_app, String rswithdrawl, String final_temp, String do_sanc, double bill_unit, double amt_avail, double amt_per, double amt_app, double amt_sanc, String contact) {
        this.name = name;
        this.fhname = fhname;
        this.email = email;
        this.desig = desig;
        this.work_under = work_under;
        this.station = station;
        this.dep = dep;
        this.do_appoint = do_appoint;
        this.do_ret = do_ret;
        this.rate_pay = rate_pay;
        this.do_app = do_app;
        this.rswithdrawl = rswithdrawl;
        this.final_temp = final_temp;
        this.do_sanc = do_sanc;
        this.bill_unit = bill_unit;
        this.amt_avail = amt_avail;
        this.amt_per = amt_per;
        this.amt_app = amt_app;
        this.amt_sanc = amt_sanc;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getFhname() {
        return fhname;
    }

    public String getEmail() {
        return email;
    }

    public String getDesig() {
        return desig;
    }

    public String getWork_under() {
        return work_under;
    }

    public String getStation() {
        return station;
    }

    public String getDep() {
        return dep;
    }

    public String getDo_appoint() {
        return do_appoint;
    }

    public String getDo_ret() {
        return do_ret;
    }

    public String getRate_pay() {
        return rate_pay;
    }

    public String getDo_app() {
        return do_app;
    }

    public String getRswithdrawl() {
        return rswithdrawl;
    }

    public String getFinal_temp() {
        return final_temp;
    }

    public String getDo_sanc() {
        return do_sanc;
    }

    public double getBill_unit() {
        return bill_unit;
    }

    public double getAmt_avail() {
        return amt_avail;
    }

    public double getAmt_per() {
        return amt_per;
    }

    public double getAmt_app() {
        return amt_app;
    }

    public double getAmt_sanc() {
        return amt_sanc;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFhname(String fhname) {
        this.fhname = fhname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public void setWork_under(String work_under) {
        this.work_under = work_under;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setDo_appoint(String do_appoint) {
        this.do_appoint = do_appoint;
    }

    public void setDo_ret(String do_ret) {
        this.do_ret = do_ret;
    }

    public void setRate_pay(String rate_pay) {
        this.rate_pay = rate_pay;
    }

    public void setDo_app(String do_app) {
        this.do_app = do_app;
    }

    public void setRswithdrawl(String rswithdrawl) {
        this.rswithdrawl = rswithdrawl;
    }

    public void setFinal_temp(String final_temp) {
        this.final_temp = final_temp;
    }

    public void setDo_sanc(String do_sanc) {
        this.do_sanc = do_sanc;
    }

    public void setBill_unit(double bill_unit) {
        this.bill_unit = bill_unit;
    }

    public void setAmt_avail(double amt_avail) {
        this.amt_avail = amt_avail;
    }

    public void setAmt_per(double amt_per) {
        this.amt_per = amt_per;
    }

    public void setAmt_app(double amt_app) {
        this.amt_app = amt_app;
    }

    public void setAmt_sanc(double amt_sanc) {
        this.amt_sanc = amt_sanc;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    /**
     *
     */
   
    
   
                                           
}
