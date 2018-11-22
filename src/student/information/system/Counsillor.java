/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "counsillor", catalog = "dbms", schema = "")
@NamedQueries({
    @NamedQuery(name = "Counsillor.findAll", query = "SELECT c FROM Counsillor c")
    , @NamedQuery(name = "Counsillor.findByEid", query = "SELECT c FROM Counsillor c WHERE c.eid = :eid")
    , @NamedQuery(name = "Counsillor.findByEName", query = "SELECT c FROM Counsillor c WHERE c.eName = :eName")
    , @NamedQuery(name = "Counsillor.findByBranch", query = "SELECT c FROM Counsillor c WHERE c.branch = :branch")})
public class Counsillor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Eid")
    private String eid;
    @Id
    @Basic(optional = false)
    @Column(name = "EName")
    private String eName;
    @Column(name = "Branch")
    private String branch;

    public Counsillor() {
    }

    public Counsillor(String eName) {
        this.eName = eName;
    }

    public Counsillor(String eName, String eid) {
        this.eName = eName;
        this.eid = eid;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        String oldEid = this.eid;
        this.eid = eid;
        changeSupport.firePropertyChange("eid", oldEid, eid);
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String eName) {
        String oldEName = this.eName;
        this.eName = eName;
        changeSupport.firePropertyChange("EName", oldEName, eName);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eName != null ? eName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Counsillor)) {
            return false;
        }
        Counsillor other = (Counsillor) object;
        if ((this.eName == null && other.eName != null) || (this.eName != null && !this.eName.equals(other.eName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "student.information.system.Counsillor[ eName=" + eName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
