/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Ishu
 */
@Entity
@Table(name = "fourthyr", catalog = "dbms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fourthyr.findAll", query = "SELECT f FROM Fourthyr f")
    , @NamedQuery(name = "Fourthyr.findByUsn", query = "SELECT f FROM Fourthyr f WHERE f.usn = :usn")
    , @NamedQuery(name = "Fourthyr.findByGpa", query = "SELECT f FROM Fourthyr f WHERE f.gpa = :gpa")
    , @NamedQuery(name = "Fourthyr.findByConselor", query = "SELECT f FROM Fourthyr f WHERE f.conselor = :conselor")
    , @NamedQuery(name = "Fourthyr.findByProblems", query = "SELECT f FROM Fourthyr f WHERE f.problems = :problems")
    , @NamedQuery(name = "Fourthyr.findByRemarks", query = "SELECT f FROM Fourthyr f WHERE f.remarks = :remarks")})
public class Fourthyr implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usn")
    private String usn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Gpa")
    private BigDecimal gpa;
    @Column(name = "Conselor")
    private String conselor;
    @Column(name = "Problems")
    private String problems;
    @Column(name = "Remarks")
    private String remarks;

    public Fourthyr() {
    }

    public Fourthyr(String usn) {
        this.usn = usn;
    }

    public Fourthyr(String usn, BigDecimal gpa) {
        this.usn = usn;
        this.gpa = gpa;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        String oldUsn = this.usn;
        this.usn = usn;
        changeSupport.firePropertyChange("usn", oldUsn, usn);
    }

    public BigDecimal getGpa() {
        return gpa;
    }

    public void setGpa(BigDecimal gpa) {
        BigDecimal oldGpa = this.gpa;
        this.gpa = gpa;
        changeSupport.firePropertyChange("gpa", oldGpa, gpa);
    }

    public String getConselor() {
        return conselor;
    }

    public void setConselor(String conselor) {
        String oldConselor = this.conselor;
        this.conselor = conselor;
        changeSupport.firePropertyChange("conselor", oldConselor, conselor);
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        String oldProblems = this.problems;
        this.problems = problems;
        changeSupport.firePropertyChange("problems", oldProblems, problems);
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        String oldRemarks = this.remarks;
        this.remarks = remarks;
        changeSupport.firePropertyChange("remarks", oldRemarks, remarks);
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
        if (!(object instanceof Fourthyr)) {
            return false;
        }
        Fourthyr other = (Fourthyr) object;
        if ((this.usn == null && other.usn != null) || (this.usn != null && !this.usn.equals(other.usn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.information.system.Fourthyr[ usn=" + usn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
