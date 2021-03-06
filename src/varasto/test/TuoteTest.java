package varasto.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import varasto.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2020.03.30 23:14:25 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class TuoteTest {



  // Generated by ComTest BEGIN
  /** testAseta146 */
  @Test
  public void testAseta146() {    // Tuote: 146
    Tuote sanky = new Tuote();  //Tuotenumeron vaihtuvuuden testaus
    Tuote sanky2 = new Tuote(); 
    Tuote sanky3 = new Tuote(); 
    sanky.aseta("Patja", 2, 2, "Aktiivinen"); 
    sanky2.aseta("Patja", 2, 2, "Aktiivinen"); 
    sanky3.aseta("Patja", 2, 2, "Aktiivinen"); 
    assertEquals("From: Tuote line: 153", sanky2.getTuotenumero() + 1, sanky3.getTuotenumero()); 
    assertEquals("From: Tuote line: 154", sanky.getTuotenumero() + 1, sanky2.getTuotenumero()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testOikeellisuusTarkistus202 */
  @Test
  public void testOikeellisuusTarkistus202() {    // Tuote: 202
    Tuote sohva = new Tuote(); 
    sohva.aseta("Sohva", 2, 2, "Aktiivinen");  //Tässä testataan tuotteen lisäämistä ja oikeellisuustarkistuksen toimivuutta, pitää mennä läpi
    assertEquals("From: Tuote line: 205", "Sohva", sohva.getNimi()); 
    assertEquals("From: Tuote line: 206", 0, sohva.getVarastoarvo()); 
    assertEquals("From: Tuote line: 207", 2, sohva.getVarastokapasiteetti()); 
    assertEquals("From: Tuote line: 208", 2, sohva.getKollit()); 
    assertEquals("From: Tuote line: 209", "Aktiivinen", sohva.getStatus()); 
    sohva.aseta("Patja", 2, 2, "Poistunut");  //Ja vielä tietojen muuttamisen testausta...
    assertEquals("From: Tuote line: 211", "Patja", sohva.getNimi()); 
    assertEquals("From: Tuote line: 212", 0, sohva.getVarastoarvo()); 
    assertEquals("From: Tuote line: 213", 2, sohva.getVarastokapasiteetti()); 
    assertEquals("From: Tuote line: 214", 2, sohva.getKollit()); 
    assertEquals("From: Tuote line: 215", "Poistunut", sohva.getStatus()); 
    sohva.aseta("Patja", 2, 2, "ei olemassa");  //Tässä testataan oikeellisuustarkistuksen toimivuutta, tällainen ei saa mennä läpi
    assertEquals("From: Tuote line: 217", "Patja", sohva.getNimi()); 
    assertEquals("From: Tuote line: 218", 0, sohva.getVarastoarvo()); 
    assertEquals("From: Tuote line: 219", 2, sohva.getVarastokapasiteetti()); 
    assertEquals("From: Tuote line: 220", 2, sohva.getKollit()); 
    assertEquals("From: Tuote line: 221", "Poistunut", sohva.getStatus()); 
    sohva.aseta("Patja", -2, 2, "Aktiivinen");  //Lisää testausta aikaisempaa, tämäkään ei saa mennä läpi
    assertEquals("From: Tuote line: 223", "Patja", sohva.getNimi()); 
    assertEquals("From: Tuote line: 224", 0, sohva.getVarastoarvo()); 
    assertEquals("From: Tuote line: 225", 2, sohva.getVarastokapasiteetti()); 
    assertEquals("From: Tuote line: 226", 2, sohva.getKollit()); 
    assertEquals("From: Tuote line: 227", "Poistunut", sohva.getStatus()); 
    sohva.muutaVarastoarvoa(-50);  //Vielä varastoarvon muutoksen testausta
    assertEquals("From: Tuote line: 229", -50, sohva.getVarastoarvo()); 
    sohva.muutaVarastoarvoa(50); 
    assertEquals("From: Tuote line: 231", 0, sohva.getVarastoarvo()); 
    sohva.muutaVarastoarvoa(0); 
    assertEquals("From: Tuote line: 233", 0, sohva.getVarastoarvo()); 
    sohva.muutaVarastoarvoa(234); 
    assertEquals("From: Tuote line: 235", 234, sohva.getVarastoarvo()); 
  } // Generated by ComTest END
}