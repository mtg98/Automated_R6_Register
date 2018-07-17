/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrinalini
 */
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;

public class insert_data extends ActionSupport {

    String khata_number;
    String case_no;
    String order_date;
    String khasra_no;
    String area;
    String hissa_area;
    String land_rev_pay;
    String deleted_name;
    String deleted_fname;
    String deleted_address;
    String insert_name;
    String insert_fname;
    String insert_address;
    String transfer_type;
    String amount;
    String challan_no;
    String decision_date;
    String remark;
    String seq_no;
    String created_by;
    String created_on;
    String modified_by;
    String modified_on;
    String device_serial_no;
    String hello;
    String vname;

    PreparedStatement ps = null;
    Connection con1 = null;
    PreparedStatement ps1, ps2 = null;
    Connection con2 = null;
    String district_code_census = null, tehsil_code_census = null, pargana_code_new = null, village_code_census = null;
    ResultSet rs1, rs2 = null;

    @Override
    public String execute() throws Exception {
        if ("आगे बढ़े".equals("hello")) {
            try {
                Class.forName("org.postgresql.Driver");
                //creating connection Using Postgres Change it to other
                con1 = DriverManager.getConnection("jdbc:postgresql://10.135.28.162:5432/up_lrc", "postgres", "postgres");
                ps1 = con1.prepareStatement("select district_code_census, tehsil_code_census, paragana_code_new, village_code_census from up_user_master u left join up_village_master v on ( u.district_code_census = v.district_code_census AND u.tehsil_code_census = v.tehsil_code_census) where v.vname =? ");
                ps1.setString(1, vname);
                rs1 = ps1.executeQuery();

                district_code_census = rs1.getString("district_census_code");
                tehsil_code_census = rs1.getString("tehsil_census_code ");
                pargana_code_new = rs1.getString(" pargana_code_new");
                village_code_census = rs1.getString("village_code_census");

                try {
                    Class.forName("org.postgresql.Driver");
                    //creating connection Using Postgres Change it to other
                    con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "abc");
                    ps2 = con2.prepareStatement("INSERT INTO R6_Register VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    ps2.setString(1, district_code_census);
                    ps2.setString(2, tehsil_code_census);
                    ps2.setString(3, pargana_code_new);
                    ps2.setString(4, village_code_census);
                    ps2.setString(5, khata_number);
                    ps2.setString(6, case_no);
                    ps2.setString(7, order_date);
                    ps2.setString(8, khasra_no);
                    ps2.setString(9, area);
                    ps2.setString(10, hissa_area);
                    ps2.setString(11, land_rev_pay);
                    ps2.setString(12, deleted_name);
                    ps2.setString(13, deleted_fname);
                    ps2.setString(14, deleted_address);

                    ps2.setString(15, insert_name);
                    ps2.setString(16, insert_fname);
                    ps2.setString(17, insert_address);

                    ps2.setString(18, transfer_type);
                    ps2.setString(19, amount);
                    ps2.setString(20, decision_date);
                    ps2.setString(21, challan_no);
                    ps2.setString(22, remark);
                    ps2.setString(23, seq_no);
                    ps2.setString(24, created_by);
                    ps2.setString(25, created_on);
                    ps2.setString(26, modified_by);
                    ps2.setString(27, modified_on);
                    ps2.setString(28, device_serial_no);

                    int i = ps.executeUpdate();
                    if (i > 0) {

                        con2.close();
                        con1.close();
                        return "SUCCESS";

                    } else {

                        con2.close();
                        return "ERROR";
                    }
                } catch (ClassNotFoundException | SQLException e) {
                }
                con2.close();
                return "ERROR";
            } catch (ClassNotFoundException | SQLException e) {
            }
            con2.close();
            return "ERROR";
        }
        return "SUCCESS";
    }

    public String getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(String seq_no) {
        this.seq_no = seq_no;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getKhata_number() {
        return khata_number;
    }

    public void setKhata_number(String khata_number) {
        this.khata_number = khata_number;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getKhasra_no() {
        return khasra_no;
    }

    public void setKhasra_no(String khasra_no) {
        this.khasra_no = khasra_no;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHissa_area() {
        return hissa_area;
    }

    public void setHissa_area(String hissa_area) {
        this.hissa_area = hissa_area;
    }

    public String getLand_rev_pay() {
        return land_rev_pay;
    }

    public void setLand_rev_pay(String land_rev_pay) {
        this.land_rev_pay = land_rev_pay;
    }

    public String getDeleted_name() {
        return deleted_name;
    }

    public void setDeleted_name(String deleted_name) {
        this.deleted_name = deleted_name;
    }

    public String getDeleted_fname() {
        return deleted_fname;
    }

    public void setDeleted_fname(String deleted_fname) {
        this.deleted_fname = deleted_fname;
    }

    public String getDeleted_address() {
        return deleted_address;
    }

    public void setDeleted_address(String deleted_address) {
        this.deleted_address = deleted_address;
    }

    public String getInsert_name() {
        return insert_name;
    }

    public void setInsert_name(String insert_name) {
        this.insert_name = insert_name;
    }

    public String getInsert_address() {
        return insert_address;
    }

    public void setInsert_address(String insert_address) {
        this.insert_address = insert_address;
    }

    public String getInsert_fname() {
        return insert_fname;
    }

    public void setInsert_fname(String insert_fname) {
        this.insert_fname = insert_fname;
    }

    public String getTransfer_type() {
        return transfer_type;
    }

    public void setTransfer_type(String transfer_type) {
        this.transfer_type = transfer_type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getChallan_no() {
        return challan_no;
    }

    public void setChallan_no(String challan_no) {
        this.challan_no = challan_no;
    }

    public String getDecision_date() {
        return decision_date;
    }

    public void setDecision_date(String decision_date) {
        this.decision_date = decision_date;
    }

    public String getremark() {
        return remark;
    }

    public void setremark(String remark) {
        this.remark = remark;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_on) {
        this.created_by = created_by;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public String getModified_on() {
        return modified_on;
    }

    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }

    public String getDevice_serial_no() {
        return device_serial_no;
    }

    public void setDevice_serial_no(String device_serial_no) {
        this.device_serial_no = device_serial_no;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

}
