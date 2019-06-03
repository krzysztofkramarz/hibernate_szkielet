package com.fonowizja.hibernate_szkielet;

import javax.persistence.*;

/**
 * @author krzysztof.kramarz
 */
@Entity
class Rower {
//    @GeneratedValue(generator = "mojSuperGenerator", strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "mojSuperGenerator", initialValue = 21,
//            allocationSize = 120, schema = "klient_nasz_pan",
//            catalog = "sprzedaż", sequenceName = "mojaSekwencja")
//    private Long id;


    @GeneratedValue(generator = "mojSuperGenerator", strategy = GenerationType.TABLE)
    @TableGenerator(name = "mojSuperGenerator", initialValue = 21,
            allocationSize = 120, schema = "klient_nasz_pan",
            catalog = "sprzedaż", table = "tabelaGenerator",
    pkColumnName = "id" , pkColumnValue = "3")



    private Long id;
}
