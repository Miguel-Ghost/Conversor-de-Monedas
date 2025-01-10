import java.util.HashMap;
import java.util.Map;

public class NombreMoneda {
    private static final Map<String, String> nombreMoneda = new HashMap<>();

    static {
        nombreMoneda.put("USD", "Estados Unidos (Dólar estadounidense)");
        nombreMoneda.put("AED", "Emiratos Arabes Unidos (Dirham)");
        nombreMoneda.put("AFN", "Afganistan (Afghani)");
        nombreMoneda.put("ALL", "Albania (Lek)");
        nombreMoneda.put("AMD", "Armenia (Dram)");
        nombreMoneda.put("ANG", "Antillas Neerlandesas (Florín)");
        nombreMoneda.put("AOA", "Angola (Kwanza)");
        nombreMoneda.put("ARS", "Argentina (Peso argentino)");
        nombreMoneda.put("AUD", "Australia (Dólar australiano)");
        nombreMoneda.put("AWG", "Aruba (Florín)");
        nombreMoneda.put("AZN", "Azerbaiyan (Manat)");
        nombreMoneda.put("BAM", "Bosnia y Herzegovina (Marco convertible)");
        nombreMoneda.put("BBD", "Barbados (Dólar barbadense)");
        nombreMoneda.put("BDT", "Banglades (Taka)");
        nombreMoneda.put("BGN", "Bulgaria (Lev)");
        nombreMoneda.put("BHD", "Barein (Dinar)");
        nombreMoneda.put("BIF", "Burundi (Franco burundés)");
        nombreMoneda.put("BMD", "Bermudas (Dólar bermudeño)");
        nombreMoneda.put("BND", "Brunei (Dólar de Brunéi)");
        nombreMoneda.put("BOB", "Bolivia (Boliviano)");
        nombreMoneda.put("BRL", "Brasil (Real brasileño)");
        nombreMoneda.put("BSD", "Bahamas (Dólar bahameño)");
        nombreMoneda.put("BTN", "Butan (Ngultrum)");
        nombreMoneda.put("BWP", "Botsuana (Pula)");
        nombreMoneda.put("BYN", "Bielorrusia (Rublo bielorruso)");
        nombreMoneda.put("BZD", "Belice (Dólar beliceño)");
        nombreMoneda.put("CAD", "Canada (Dólar canadiense)");
        nombreMoneda.put("CDF", "Republica Democrática del Congo (Franco congoleño)");
        nombreMoneda.put("CHF", "Suiza (Franco suizo)");
        nombreMoneda.put("CLP", "Chile (Peso chileno)");
        nombreMoneda.put("CNY", "China (Yuan)");
        nombreMoneda.put("COP", "Colombia (Peso colombiano)");
        nombreMoneda.put("CRC", "Costa Rica (Colón)");
        nombreMoneda.put("CUP", "Cuba (Peso cubano)");
        nombreMoneda.put("CVE", "Cabo Verde (Escudo caboverdiano)");
        nombreMoneda.put("CZK", "Republica Checa (Corona checa)");
        nombreMoneda.put("DJF", "Yibuti (Franco yibutiano)");
        nombreMoneda.put("DKK", "Dinamarca (Corona danesa)");
        nombreMoneda.put("DOP", "Republica Dominicana (Peso dominicano)");
        nombreMoneda.put("DZD", "Argelia (Dinar argelino)");
        nombreMoneda.put("EGP", "Egipto (Libra egipcia)");
        nombreMoneda.put("ERN", "Eritrea (Nakfa)");
        nombreMoneda.put("ETB", "Etiopía (Birr)");
        nombreMoneda.put("EUR", "Union Europea (Euro)");
        nombreMoneda.put("FJD", "Fiyi (Dólar fiyiano)");
        nombreMoneda.put("FKP", "Islas Malvinas (Libra malvinense)");
        nombreMoneda.put("FOK", "Islas Feroe (Corona feroesa)");
        nombreMoneda.put("GBP", "Reino Unido (Libra esterlina)");
        nombreMoneda.put("GEL", "Georgia (Lari)");
        nombreMoneda.put("GGP", "Guernsey (Libra de Guernsey)");
        nombreMoneda.put("GHS", "Ghana (Cedi)");
        nombreMoneda.put("GIP", "Gibraltar (Libra gibraltareña)");
        nombreMoneda.put("GMD", "Gambia (Dalasi)");
        nombreMoneda.put("GNF", "Guinea (Franco guineano)");
        nombreMoneda.put("GTQ", "Guatemala (Quetzal)");
        nombreMoneda.put("GYD", "Guyana (Dólar guyanés)");
        nombreMoneda.put("HKD", "Hong Kong (Dólar hongkonés)");
        nombreMoneda.put("HNL", "Honduras (Lempira)");
        nombreMoneda.put("HRK", "Croacia (Kuna)");
        nombreMoneda.put("HTG", "Haiti (Gourde)");
        nombreMoneda.put("HUF", "Hungria (Forinto)");
        nombreMoneda.put("IDR", "Indonesia (Rupia indonesia)");
        nombreMoneda.put("ILS", "Israel (Nuevo shéquel)");
        nombreMoneda.put("IMP", "Isla de Man (Libra manesa)");
        nombreMoneda.put("INR", "India (Rupia india)");
        nombreMoneda.put("IQD", "Irak (Dinar iraquí)");
        nombreMoneda.put("IRR", "Iran (Rial)");
        nombreMoneda.put("ISK", "Islandia (Corona islandesa)");
        nombreMoneda.put("JEP", "Jersey (Libra de Jersey)");
        nombreMoneda.put("JMD", "Jamaica (Dólar jamaiquino)");
        nombreMoneda.put("JOD", "Jordania (Dinar jordano)");
        nombreMoneda.put("JPY", "Japon (Yen)");
        nombreMoneda.put("KES", "Kenia (Chelín keniano)");
        nombreMoneda.put("KGS", "Kirguistan (Som kirguís)");
        nombreMoneda.put("KHR", "Camboya (Riel)");
        nombreMoneda.put("KMF", "Comoras (Franco comorano)");
        nombreMoneda.put("KRW", "Corea del Sur (Won)");
        nombreMoneda.put("KWD", "Kuwait (Dinar kuwaití)");
        nombreMoneda.put("KYD", "Islas Caimán (Dólar caimano)");
        nombreMoneda.put("KZT", "Kazajistan (Tengue)");
        nombreMoneda.put("LAK", "Laos (Kip)");
        nombreMoneda.put("LBP", "Libano (Libra libanesa)");
        nombreMoneda.put("LKR", "Sri Lanka (Rupia de Sri Lanka)");
        nombreMoneda.put("LRD", "Liberia (Dólar liberiano)");
        nombreMoneda.put("LSL", "Lesoto (Loti)");
        nombreMoneda.put("LYD", "Libia (Dinar libio)");
        nombreMoneda.put("MAD", "Marruecos (Dirham marroquí)");
        nombreMoneda.put("MDL", "Moldavia (Leu moldavo)");
        nombreMoneda.put("MGA", "Madagascar (Ariary)");
        nombreMoneda.put("MKD", "Macedonia del Norte (Denar)");
        nombreMoneda.put("MMK", "Birmania (Kyat)");
        nombreMoneda.put("MNT", "Mongolia (Tugrik)");
        nombreMoneda.put("MOP", "Macao (Pataca)");
        nombreMoneda.put("MRU", "Mauritania (Ouguiya)");
        nombreMoneda.put("MUR", "Mauricio (Rupia mauriciana)");
        nombreMoneda.put("MVR", "Maldivas (Rupia maldiva)");
        nombreMoneda.put("MWK", "Malaui (Kwacha)");
        nombreMoneda.put("MXN", "Mexico (Peso mexicano)");
        nombreMoneda.put("MYR", "Malasia (Ringgit)");
        nombreMoneda.put("MZN", "Mozambique (Metical)");
        nombreMoneda.put("NAD", "Namibia (Dólar namibio)");
        nombreMoneda.put("NGN", "Nigeria (Naira)");
        nombreMoneda.put("NIO", "Nicaragua (Córdoba)");
        nombreMoneda.put("NOK", "Noruega (Corona noruega)");
        nombreMoneda.put("NPR", "Nepal (Rupia nepalí)");
        nombreMoneda.put("NZD", "Nueva Zelanda (Dólar neozelandés)");
        nombreMoneda.put("OMR", "Oman (Rial omaní)");
        nombreMoneda.put("PAB", "Panama (Balboa)");
        nombreMoneda.put("PEN", "Peru (Sol)");
        nombreMoneda.put("PGK", "Papua Nueva Guinea (Kina)");
        nombreMoneda.put("PHP", "Filipinas (Peso filipino)");
        nombreMoneda.put("PKR", "Pakistan (Rupia paquistaní)");
        nombreMoneda.put("PLN", "Polonia (Zloty)");
        nombreMoneda.put("PYG", "Paraguay (Guaraní)");
        nombreMoneda.put("QAR", "Catar (Rial catarí)");
        nombreMoneda.put("RON", "Rumania (Leu rumano)");
        nombreMoneda.put("RSD", "Serbia (Dinar serbio)");
        nombreMoneda.put("RUB", "Rusia (Rublo ruso)");
        nombreMoneda.put("RWF", "Ruanda (Franco ruandés)");
        nombreMoneda.put("SAR", "Arabia Saudita (Riyal saudí)");
        nombreMoneda.put("SBD", "Islas Salomón (Dólar salomonense)");
        nombreMoneda.put("SCR", "Seychelles (Rupia de Seychelles)");
        nombreMoneda.put("SDG", "Sudan (Libra sudanesa)");
        nombreMoneda.put("SEK", "Suecia (Corona sueca)");
        nombreMoneda.put("SGD", "Singapur (Dólar singapurense)");
        nombreMoneda.put("SHP", "Santa Elena (Libra de Santa Elena)");
        nombreMoneda.put("SLL", "Sierra Leona (Leone)");
        nombreMoneda.put("SOS", "Somalia (Chelín somalí)");
        nombreMoneda.put("SRD", "Surinam (Dólar surinamés)");
        nombreMoneda.put("SSP", "Sudan del Sur (Libra sursudanesa)");
        nombreMoneda.put("STN", "Santo Tome y Príncipe (Dobra)");
        nombreMoneda.put("SYP", "Siria (Libra siria)");
        nombreMoneda.put("SZL", "Esuatini (Lilangeni)");
        nombreMoneda.put("THB", "Tailandia (Baht)");
        nombreMoneda.put("TJS", "Tayikistan (Somoni)");
        nombreMoneda.put("TMT", "Turkmenistan (Manat)");
        nombreMoneda.put("TND", "Tunez (Dinar tunecino)");
        nombreMoneda.put("TOP", "Tonga (Pa'anga)");
        nombreMoneda.put("TRY", "Turquia (Lira turca)");
        nombreMoneda.put("TTD", "Trinidad y Tobago (Dólar trinitense)");
        nombreMoneda.put("TVD", "Tuvalu (Dolar australiano)");
        nombreMoneda.put("TWD", "Taiwan (Nuevo dolar taiwanés)");
        nombreMoneda.put("TZS", "Tanzania (Chelín tanzano)");
        nombreMoneda.put("UAH", "Ucrania (Grivna)");
        nombreMoneda.put("UGX", "Uganda (Chelin ugandés)");
        nombreMoneda.put("UYU", "Uruguay (Peso uruguayo)");
        nombreMoneda.put("UZS", "Uzbekistan (Som uzbeko)");
        nombreMoneda.put("VES", "Venezuela (Bolivar)");
        nombreMoneda.put("VND", "Vietnam (Dong)");
        nombreMoneda.put("VUV", "Vanuatu (Vatu)");
        nombreMoneda.put("WST", "Samoa (Tala)");
        nombreMoneda.put("XAF", "Africa Central (Franco CFA)");
        nombreMoneda.put("XCD", "Caribe Oriental (Dólar del Caribe Oriental)");
        nombreMoneda.put("XDR", "Derechos Especiales de Giro (FMI)");
        nombreMoneda.put("XOF", "Africa Occidental (Franco CFA)");
        nombreMoneda.put("XPF", "Polinesia Francesa (Franco CFP)");
        nombreMoneda.put("YER", "Yemen (Rial yemeni)");
        nombreMoneda.put("ZAR", "Sudafrica (Rand)");
        nombreMoneda.put("ZMW", "Zambia (Kwacha zambiano)");
        nombreMoneda.put("ZWL", "Zimbabue (Dólar zimbabuense)");
    }


    public static Map<String, String> getNombreMoneda() {
        return nombreMoneda;
    }


    public static String encontrarCodigo(String codigo) {
        return nombreMoneda.getOrDefault(codigo.toUpperCase(), "Código no encontrado");

    }


    public static String encontrarNombre(String name) {
        for (Map.Entry<String, String> entry : nombreMoneda.entrySet()) {
            if (entry.getValue().toLowerCase().contains(name.toLowerCase())) {
                return entry.getKey();
            }
        }
        return "Nombre no encontrado";
    }
}
