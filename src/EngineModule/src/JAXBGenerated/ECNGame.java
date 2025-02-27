//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.09 at 07:47:34 PM IDT 
//


package EngineModule.src.JAXBGenerated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ECN-Words"/>
 *         &lt;element ref="{}ECN-Board"/>
 *         &lt;element ref="{}ECN-Team1"/>
 *         &lt;element ref="{}ECN-Team2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ecnWords",
    "ecnBoard",
    "ecnTeam1",
    "ecnTeam2"
})
@XmlRootElement(name = "ECN-Game")
public class ECNGame {

    @XmlElement(name = "ECN-Words", required = true)
    protected ECNWords ecnWords;
    @XmlElement(name = "ECN-Board", required = true)
    protected ECNBoard ecnBoard;
    @XmlElement(name = "ECN-Team1", required = true)
    protected ECNTeam1 ecnTeam1;
    @XmlElement(name = "ECN-Team2", required = true)
    protected ECNTeam2 ecnTeam2;

    /**
     * Gets the value of the ecnWords property.
     * 
     * @return
     *     possible object is
     *     {@link ECNWords }
     *     
     */
    public ECNWords getECNWords() {
        return ecnWords;
    }

    /**
     * Sets the value of the ecnWords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECNWords }
     *     
     */
    public void setECNWords(ECNWords value) {
        this.ecnWords = value;
    }

    /**
     * Gets the value of the ecnBoard property.
     * 
     * @return
     *     possible object is
     *     {@link ECNBoard }
     *     
     */
    public ECNBoard getECNBoard() {
        return ecnBoard;
    }

    /**
     * Sets the value of the ecnBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECNBoard }
     *     
     */
    public void setECNBoard(ECNBoard value) {
        this.ecnBoard = value;
    }

    /**
     * Gets the value of the ecnTeam1 property.
     * 
     * @return
     *     possible object is
     *     {@link ECNTeam1 }
     *     
     */
    public ECNTeam1 getECNTeam1() {
        return ecnTeam1;
    }

    /**
     * Sets the value of the ecnTeam1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECNTeam1 }
     *     
     */
    public void setECNTeam1(ECNTeam1 value) {
        this.ecnTeam1 = value;
    }

    /**
     * Gets the value of the ecnTeam2 property.
     * 
     * @return
     *     possible object is
     *     {@link ECNTeam2 }
     *     
     */
    public ECNTeam2 getECNTeam2() {
        return ecnTeam2;
    }

    /**
     * Sets the value of the ecnTeam2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECNTeam2 }
     *     
     */
    public void setECNTeam2(ECNTeam2 value) {
        this.ecnTeam2 = value;
    }

}
