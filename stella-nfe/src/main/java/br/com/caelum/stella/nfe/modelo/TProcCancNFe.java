//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.23 at 03:29:26 PM BRT 
//

package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcCancNFe", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = { "cancNFe", "retCancNFe" })
@XmlRootElement
public class TProcCancNFe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TCancNFe cancNFe;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
    protected TRetCancNFe retCancNFe;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    public TCancNFe getCancNFe() {
        return cancNFe;
    }

    public void setCancNFe(final TCancNFe value) {
        cancNFe = value;
    }

    public TRetCancNFe getRetCancNFe() {
        return retCancNFe;
    }

    public void setRetCancNFe(final TRetCancNFe value) {
        retCancNFe = value;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(final String value) {
        versao = value;
    }

}
