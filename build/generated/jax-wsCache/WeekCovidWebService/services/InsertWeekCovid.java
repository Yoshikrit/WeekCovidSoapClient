
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertWeekCovid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertWeekCovid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="co" type="{http://services/}weekcovid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertWeekCovid", propOrder = {
    "co"
})
public class InsertWeekCovid {

    protected Weekcovid co;

    /**
     * Gets the value of the co property.
     * 
     * @return
     *     possible object is
     *     {@link Weekcovid }
     *     
     */
    public Weekcovid getCo() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weekcovid }
     *     
     */
    public void setCo(Weekcovid value) {
        this.co = value;
    }

}
