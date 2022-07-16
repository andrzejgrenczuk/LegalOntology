package pl.grenczuk.metaonto.impl;

import pl.grenczuk.metaonto.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultZakres_podmiotowy <br>
 * @version generated on Sat May 07 16:00:15 CEST 2022 by andrz
 */
public class DefaultZakres_podmiotowy extends WrappedIndividualImpl implements Zakres_podmiotowy {

    public DefaultZakres_podmiotowy(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#AdresEmail
     */
     
    public Collection<? extends String> getAdresEmail() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESEMAIL, String.class);
    }

    public boolean hasAdresEmail() {
		return !getAdresEmail().isEmpty();
    }

    public void addAdresEmail(String newAdresEmail) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESEMAIL, newAdresEmail);
    }

    public void removeAdresEmail(String oldAdresEmail) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESEMAIL, oldAdresEmail);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#AdresWWW
     */
     
    public Collection<? extends String> getAdresWWW() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESWWW, String.class);
    }

    public boolean hasAdresWWW() {
		return !getAdresWWW().isEmpty();
    }

    public void addAdresWWW(String newAdresWWW) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESWWW, newAdresWWW);
    }

    public void removeAdresWWW(String oldAdresWWW) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRESWWW, oldAdresWWW);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#Adres_sądu
     */
     
    public Collection<? extends String> getAdres_sądu() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRES_SĄDU, String.class);
    }

    public boolean hasAdres_sądu() {
		return !getAdres_sądu().isEmpty();
    }

    public void addAdres_sądu(String newAdres_sądu) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRES_SĄDU, newAdres_sądu);
    }

    public void removeAdres_sądu(String oldAdres_sądu) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ADRES_SĄDU, oldAdres_sądu);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#DaneKontaktowe
     */
     
    public Collection<? extends Object> getDaneKontaktowe() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DANEKONTAKTOWE, Object.class);
    }

    public boolean hasDaneKontaktowe() {
		return !getDaneKontaktowe().isEmpty();
    }

    public void addDaneKontaktowe(Object newDaneKontaktowe) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DANEKONTAKTOWE, newDaneKontaktowe);
    }

    public void removeDaneKontaktowe(Object oldDaneKontaktowe) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DANEKONTAKTOWE, oldDaneKontaktowe);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#Miejscowość
     */
     
    public Collection<? extends String> getMiejscowość() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIEJSCOWOŚĆ, String.class);
    }

    public boolean hasMiejscowość() {
		return !getMiejscowość().isEmpty();
    }

    public void addMiejscowość(String newMiejscowość) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIEJSCOWOŚĆ, newMiejscowość);
    }

    public void removeMiejscowość(String oldMiejscowość) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MIEJSCOWOŚĆ, oldMiejscowość);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#NazwaSądu
     */
     
    public Collection<? extends String> getNazwaSądu() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAZWASĄDU, String.class);
    }

    public boolean hasNazwaSądu() {
		return !getNazwaSądu().isEmpty();
    }

    public void addNazwaSądu(String newNazwaSądu) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAZWASĄDU, newNazwaSądu);
    }

    public void removeNazwaSądu(String oldNazwaSądu) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_NAZWASĄDU, oldNazwaSądu);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#StatusOsoby
     */
     
    public Collection<? extends Object> getStatusOsoby() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUSOSOBY, Object.class);
    }

    public boolean hasStatusOsoby() {
		return !getStatusOsoby().isEmpty();
    }

    public void addStatusOsoby(Object newStatusOsoby) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUSOSOBY, newStatusOsoby);
    }

    public void removeStatusOsoby(Object oldStatusOsoby) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATUSOSOBY, oldStatusOsoby);
    }


}
