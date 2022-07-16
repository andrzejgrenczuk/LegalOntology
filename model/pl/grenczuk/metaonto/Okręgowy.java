package pl.grenczuk.metaonto;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Okręgowy <br>
 * @version generated on Sat May 07 16:00:15 CEST 2022 by andrz
 */

public interface Okręgowy extends Rodzaje_sądów {

    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#AdresEmail
     */
     
    /**
     * Gets all property values for the AdresEmail property.<p>
     * 
     * @returns a collection of values for the AdresEmail property.
     */
    Collection<? extends String> getAdresEmail();

    /**
     * Checks if the class has a AdresEmail property value.<p>
     * 
     * @return true if there is a AdresEmail property value.
     */
    boolean hasAdresEmail();

    /**
     * Adds a AdresEmail property value.<p>
     * 
     * @param newAdresEmail the AdresEmail property value to be added
     */
    void addAdresEmail(String newAdresEmail);

    /**
     * Removes a AdresEmail property value.<p>
     * 
     * @param oldAdresEmail the AdresEmail property value to be removed.
     */
    void removeAdresEmail(String oldAdresEmail);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#AdresWWW
     */
     
    /**
     * Gets all property values for the AdresWWW property.<p>
     * 
     * @returns a collection of values for the AdresWWW property.
     */
    Collection<? extends String> getAdresWWW();

    /**
     * Checks if the class has a AdresWWW property value.<p>
     * 
     * @return true if there is a AdresWWW property value.
     */
    boolean hasAdresWWW();

    /**
     * Adds a AdresWWW property value.<p>
     * 
     * @param newAdresWWW the AdresWWW property value to be added
     */
    void addAdresWWW(String newAdresWWW);

    /**
     * Removes a AdresWWW property value.<p>
     * 
     * @param oldAdresWWW the AdresWWW property value to be removed.
     */
    void removeAdresWWW(String oldAdresWWW);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#Adres_sądu
     */
     
    /**
     * Gets all property values for the Adres_sądu property.<p>
     * 
     * @returns a collection of values for the Adres_sądu property.
     */
    Collection<? extends String> getAdres_sądu();

    /**
     * Checks if the class has a Adres_sądu property value.<p>
     * 
     * @return true if there is a Adres_sądu property value.
     */
    boolean hasAdres_sądu();

    /**
     * Adds a Adres_sądu property value.<p>
     * 
     * @param newAdres_sądu the Adres_sądu property value to be added
     */
    void addAdres_sądu(String newAdres_sądu);

    /**
     * Removes a Adres_sądu property value.<p>
     * 
     * @param oldAdres_sądu the Adres_sądu property value to be removed.
     */
    void removeAdres_sądu(String oldAdres_sądu);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#DaneKontaktowe
     */
     
    /**
     * Gets all property values for the DaneKontaktowe property.<p>
     * 
     * @returns a collection of values for the DaneKontaktowe property.
     */
    Collection<? extends Object> getDaneKontaktowe();

    /**
     * Checks if the class has a DaneKontaktowe property value.<p>
     * 
     * @return true if there is a DaneKontaktowe property value.
     */
    boolean hasDaneKontaktowe();

    /**
     * Adds a DaneKontaktowe property value.<p>
     * 
     * @param newDaneKontaktowe the DaneKontaktowe property value to be added
     */
    void addDaneKontaktowe(Object newDaneKontaktowe);

    /**
     * Removes a DaneKontaktowe property value.<p>
     * 
     * @param oldDaneKontaktowe the DaneKontaktowe property value to be removed.
     */
    void removeDaneKontaktowe(Object oldDaneKontaktowe);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#Miejscowość
     */
     
    /**
     * Gets all property values for the Miejscowość property.<p>
     * 
     * @returns a collection of values for the Miejscowość property.
     */
    Collection<? extends String> getMiejscowość();

    /**
     * Checks if the class has a Miejscowość property value.<p>
     * 
     * @return true if there is a Miejscowość property value.
     */
    boolean hasMiejscowość();

    /**
     * Adds a Miejscowość property value.<p>
     * 
     * @param newMiejscowość the Miejscowość property value to be added
     */
    void addMiejscowość(String newMiejscowość);

    /**
     * Removes a Miejscowość property value.<p>
     * 
     * @param oldMiejscowość the Miejscowość property value to be removed.
     */
    void removeMiejscowość(String oldMiejscowość);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#NazwaSądu
     */
     
    /**
     * Gets all property values for the NazwaSądu property.<p>
     * 
     * @returns a collection of values for the NazwaSądu property.
     */
    Collection<? extends String> getNazwaSądu();

    /**
     * Checks if the class has a NazwaSądu property value.<p>
     * 
     * @return true if there is a NazwaSądu property value.
     */
    boolean hasNazwaSądu();

    /**
     * Adds a NazwaSądu property value.<p>
     * 
     * @param newNazwaSądu the NazwaSądu property value to be added
     */
    void addNazwaSądu(String newNazwaSądu);

    /**
     * Removes a NazwaSądu property value.<p>
     * 
     * @param oldNazwaSądu the NazwaSądu property value to be removed.
     */
    void removeNazwaSądu(String oldNazwaSądu);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#StatusOsoby
     */
     
    /**
     * Gets all property values for the StatusOsoby property.<p>
     * 
     * @returns a collection of values for the StatusOsoby property.
     */
    Collection<? extends Object> getStatusOsoby();

    /**
     * Checks if the class has a StatusOsoby property value.<p>
     * 
     * @return true if there is a StatusOsoby property value.
     */
    boolean hasStatusOsoby();

    /**
     * Adds a StatusOsoby property value.<p>
     * 
     * @param newStatusOsoby the StatusOsoby property value to be added
     */
    void addStatusOsoby(Object newStatusOsoby);

    /**
     * Removes a StatusOsoby property value.<p>
     * 
     * @param oldStatusOsoby the StatusOsoby property value to be removed.
     */
    void removeStatusOsoby(Object oldStatusOsoby);



    /* ***************************************************
     * Property http://www.semanticweb.org/andrz/ontologies/2021/9/PostepowanieCywilne#TelefonSądu
     */
     
    /**
     * Gets all property values for the TelefonSądu property.<p>
     * 
     * @returns a collection of values for the TelefonSądu property.
     */
    Collection<? extends String> getTelefonSądu();

    /**
     * Checks if the class has a TelefonSądu property value.<p>
     * 
     * @return true if there is a TelefonSądu property value.
     */
    boolean hasTelefonSądu();

    /**
     * Adds a TelefonSądu property value.<p>
     * 
     * @param newTelefonSądu the TelefonSądu property value to be added
     */
    void addTelefonSądu(String newTelefonSądu);

    /**
     * Removes a TelefonSądu property value.<p>
     * 
     * @param oldTelefonSądu the TelefonSądu property value to be removed.
     */
    void removeTelefonSądu(String oldTelefonSądu);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
