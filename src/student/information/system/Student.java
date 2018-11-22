/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Ishu
 */
@Entity
@Table(name = "student", catalog = "dbms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findByUsn", query = "SELECT s FROM Student s WHERE s.usn = :usn")
    , @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name")
    , @NamedQuery(name = "Student.findByBranch", query = "SELECT s FROM Student s WHERE s.branch = :branch")
    , @NamedQuery(name = "Student.findByDateofBirth", query = "SELECT s FROM Student s WHERE s.dateofBirth = :dateofBirth")
    , @NamedQuery(name = "Student.findByJoiningYear", query = "SELECT s FROM Student s WHERE s.joiningYear = :joiningYear")
    , @NamedQuery(name = "Student.findByQuota", query = "SELECT s FROM Student s WHERE s.quota = :quota")
    , @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender")
    , @NamedQuery(name = "Student.findByPhone", query = "SELECT s FROM Student s WHERE s.phone = :phone")})
public class Student implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USN")
    private String usn;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Column(name = "Branch")
    private String branch;
    @Column(name = "Date_of_Birth")
    @Temporal(TemporalType.DATE)
    private Date dateofBirth;
    @Basic(optional = false)
    @Column(name = "Joining_Year")
    private int joiningYear;
    @Basic(optional = false)
    @Column(name = "Quota")
    private String quota;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "phone")
    private BigInteger phone;

    public Student() {
    }

    public Student(String usn) {
        this.usn = usn;
    }

    public Student(String usn, String name, int joiningYear, String quota) {
        this.usn = usn;
        this.name = name;
        this.joiningYear = joiningYear;
        this.quota = quota;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        String oldUsn = this.usn;
        this.usn = usn;
        changeSupport.firePropertyChange("usn", oldUsn, usn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        Date oldDateofBirth = this.dateofBirth;
        this.dateofBirth = dateofBirth;
        changeSupport.firePropertyChange("dateofBirth", oldDateofBirth, dateofBirth);
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        int oldJoiningYear = this.joiningYear;
        this.joiningYear = joiningYear;
        changeSupport.firePropertyChange("joiningYear", oldJoiningYear, joiningYear);
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        String oldQuota = this.quota;
        this.quota = quota;
        changeSupport.firePropertyChange("quota", oldQuota, quota);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        BigInteger oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usn != null ? usn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.usn == null && other.usn != null) || (this.usn != null && !this.usn.equals(other.usn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.information.system.Student[ usn=" + usn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
