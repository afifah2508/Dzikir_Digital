package com.nida.idn.dzikir_digital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nida.idn.dzikir_digital.Adapter.ViewPagerAdapterPG
import com.nida.idn.dzikir_digital.Adapter.ViewPagerAdapterPT
import com.nida.idn.dzikir_digital.Data.DataPagi
import com.nida.idn.dzikir_digital.Data.DataPetang
import kotlinx.android.synthetic.main.activity_petang.*

class PetangActivity : AppCompatActivity() {

    private val adapterPetang = ViewPagerAdapterPT(
        listOf(
            DataPetang(
                "Dzikir Petang",
                "[1/20] Membaca Ayat Kursi (1x)",
                "أَع ُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ" +
                        "\n" +
                        "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ\n"+
                        "\n",
                "\"Allahu laa ilaaha illaa huwal hayyul qayyumm, laa ta`khuduhuu sinatun wa laa naum, lahuu maa fissamaawaati wa maa fil ardhi, man dzalladzii yasyfa'u 'indahuu illaa bi idznih, ya'lamu maa bainaa aidiihiim wa maa khalfahum, wa laa yuhiithuuna bi syai-in min 'ilmihii ilaa bimaa syaa-a, wa si'a kursiyyuhussamaawaati wal ardhi, wa laa ya-uuduhu hifzhuhumaa wa huswal 'aliyyul 'azhiim\n",
                "\"Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (Makhluk Nya). Dia tidak mengantuk dan tidak tidur. KepunyaanNya apa yang ada dilangit dan di bumi. Tiada yang dapat memberi syafa'at di sisiNya tanpa seizinNya. Dia mengetahui apa-apa yang dihadapan mereka dan dibelakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendakiNya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha Besar.\n",
                "Ibnu Katsir pun sampai menjelaskan keagungan ayat ini dalam tafsirnya yang berbunyi, “ayat kursi ini memiliki kedudukan yang sangat agung. Dalam hadits shahih dari Rasulullah Shallallahu ‘alaihi wa sallam disebutkan bahwa ia merupakan ayat teragung yang terdapat dalam Al-Quran” (Tafsir Al-Quran Al-‘Azhim)\n"
            ),

            DataPetang(
                "Dzikir Petang ",
                "[2/20] Membaca Surat Al-Ikhlas (3x) ",
                " بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                        "\n" +
                        "قُلْ هُوَ اللَّهُ أَحَدٌ  اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ\n" +
                        "\n" ,
                "Bismillahirrahmanirrahiim" +
                        "Qul huwallaahu ahad.Allahus-shamad. Lam yalid walam yuulad.walam yakullahu kufuwan ahad.",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Katakanlah: Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.”\n" +
                        "\n" ,
                " Siapa yang mengucapkannya masing - masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya" +
                        "(HR. Abu Daud no 5082, Tirmidzi no. 3575) "),

            DataPetang(
                "Dzikir Petang",
                "[3/20] Membaca Surat Al-falaq (3x)",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم\n" +
                        "\n" +
                        "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ\n" +
                        "\n" ,
                "Bismillahirrahmanirrahiim" +
                        "Qul A'udzu birabbil-falaq. Min Syarri maa Khalaq. Wamin Syarri ghaa siqin idzaa waqab. Wamin syarrin naffaastaatifil uqad. Wamin syarri haasidin idzaa hasad ",
                "Katakanlah: ‘Aku berlindung kepada Rabb Yang menguasai (waktu) Shubuh dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Serta dari kejahatan orang yang dengki apabila dia dengki." ,
                " Siapa yang mengucapkannya masing - masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya" +
                        " (HR. Abu Daud no 5082, Tirmidzi no. 3575) "),

            DataPetang(

                "Dzikir Petang",
                "[4/20] Membaca Surat An-Nas (3x)",
                "ِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم" +
                        "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ\n" +
                        "\n" ,
                "Bismillahirrahmanirrahiim" +
                        "Qul A'udzu birabbin-nas malikinnas . Ilaahin-naas. Min syarril waswaasil khannas. Alladzii, yuwaswisuii shuduurinnas. Minaljinnati wannaas",
                "Aku berlindung kepada Rabb Yang menguasai (waktu) Shubuh dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Serta dari kejahatan orang yang dengki apabila dia dengki\n" ,
                " Siapa yang mengucapkannya masing - masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya" +
                        "(HR. Abu Daud no 5082, Tirmidzi no. 3575)" ),

            DataPetang(
                "Dzikir Petang",
                "[5/20] Membaca Do'a Perlindungan (1x)",
                "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ للهِ، وَالْحَمْدُ للهِ، لَا إِلَهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ، وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، رَبِّ أَسْأَلُكَ خَيْرَ مَا فِي هَذِهِ اللَّيْلَةِ وَخَيْرَ مَا بَعْدَهَا، وَأَعُوذُبِكَ مِنْ شَرِّ مَا فِي هَذِهِ اللَّيْلَةِ وَشَرِّ مَا بَعْدَهَا، رَبِّ أَعُوذُبِكَ مِنَ الْكَسَلِ وَسُوءِ الْكِبَرِ، رَبِّ أَعُوذُبِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْ\n" +
                        "\n",
                "Amsaynaa wa amsal mulku lillah walhamdulillah, laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodir. Robbi as-aluka khoiro maa fii hadzihil lailah wa khoiro maa ba’dahaa, wa a’udzu bika min syarri maa fii hadzihil lailah wa syarri maa ba’dahaa. Robbi a’udzu bika minal kasali wa suu-il kibar. Robbi a’udzu bika min ‘adzabin fin naari wa ‘adzabin fil qobri.\n" +
                        "\n" ,
                "Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.\n" +
                        "\n" ,
                "Meminta pada Allah kebaikan di malam ini dan kebaikan sesudahnya, juga agar terhindar dari kejelekan di malam ini dan kejelekan sesudahnya. Di dalamnya berisi pula permintaan agar terhindar dari rasa malas padahal mampu untuk beramal, juga agar terhindar dari kejelekan di masa tua. Di dalamnya juga berisi permintaan agar terselamatkan dari siksa kubur dan siksa neraka yang merupakan siksa terberat di hari kiamat kelak.\n" +
                        "\n" ),

         DataPetang(
                "Dzikir Petang",
                "[6/20] Membaca Do'a Berserah diri (1x)",
             "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيْرُ\n" +
                     "\n" ,
                "Allahumma bika ash-bahnaa wa bika amsaynaa wa bika nahyaa wa bika namuutu wa ilaikan nusyuur.\n" +
                        "\n" ,
                "Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu petang, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu tempat kembali (bagi semua makhluk)\n" +
                        "\n" ,
                "(HR, Tirmidzi no. 33391 dan Abu Daud no. 5068.Alhafidzh Abu Thohir mengatakan bahwa hadits ini dinilai shahih"),
            DataPetang(
                "Dzikir Petang",
                "[7/20] Membaca Sayyidul Istigfar (1x)",
                "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ.\n" +
                        "\n" ,
                "Allahumma anta robbii laa ilaha illa anta, kholaqtanii wa anaa ‘abduka wa anaa ‘ala ‘ahdika wa wa’dika mas-tatho’tu. A’udzu bika min syarri maa shona’tu. Abu-u laka bi ni’matika ‘alayya wa abu-u bi dzambii. Fagh-firlii fainnahu laa yagh-firudz dzunuuba illa anta.\n" +
                        "\n" ,
                "Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.\n" +
                        "\n" ,
                "Barangsiapa mengucapkan dzikir ini di siang hari dalam keadaan penuh keyakinan, lalu ia mati pada hari tersebut sebelum petang hari, maka ia termasuk penghuni surga. Barangsiapa yang mengucapkannya di malam hari dalam keadaan penuh keyakinan, lalu ia mati sebelum pagi, maka ia termasuk penghuni surga.\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[8/20] Membaca Do'a 'Afiyat(3x) ",
                "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ\n" +
                        "\n" ,
                "Allahumma 'afinii fii badani Allahummma 'afinii fi sam'i Allahumma 'afinii fi basharii laa ilaaha anta Allahumma inni a'udzubika minal kufri walfaqr wa a'udzu bika min adzaabil qabr laa ilaaha illa ant ",
                "Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.\n" +
                        "\n",
                "HR. Al-Bukhari dalam Shahiib al-Adabil Mufrad no. 701, Abu Dawud no. 5090, Ahmad V/42, hasan. Lihat Shahiih Al-Adabil Mufrad no.539\n" +
                        "\n" ),


            DataPetang(
                "Dzikir Petang",
                "[9/20] Membaca Do'a Keselamatan (1x)",
                "للَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ\n" +
                        "\n" ,
                "Allahumma innii as-alukal ‘afwa wal ‘aafiyah fid dunyaa wal aakhiroh. Allahumma innii as-alukal ‘afwa wal ‘aafiyah fii diinii wa dun-yaya wa ahlii wa maalii. Allahumas-tur ‘awrootii wa aamin row’aatii. Allahummahfazh-nii mim bayni yadayya wa min kholfii wa ‘an yamiinii wa ‘an syimaalii wa min fawqii wa a’udzu bi ‘azhomatik an ughtala min tahtii.\n" +
                        "\n",
                "Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).\n" +
                        "\n",
                "Rasulullah shallallahu ‘alaihi wa sallam tidaklah pernah meninggalkan do’a ini di pagi dan petang hari. Di dalamnya berisi perlindungan dan keselamatan pada agama, dunia, keluarga dan harta dari berbagai macam gangguan yang datang dari berbagai arah.\n" +
                        "\n"),

            DataPetang(
                "Dzikir Petang",
                "[10/20] Membaca Do'a Perlindungan (1x)",
                "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ\n" +
                        "\n" ,
                "Allahumma ‘aalimal ghoybi wasy syahaadah faathiros samaawaati wal ardh. Robba kulli syai-in wa maliikah. Asyhadu alla ilaha illa anta. A’udzu bika min syarri nafsii wa min syarrisy syaythooni wa syirkihi, wa an aqtarifa ‘alaa nafsii suu-an aw ajurrohu ilaa muslim.\n" +
                        "\n" ,
                "Ya Allah, Yang Maha Mengetahui yang ghaib dan yang nyata, wahai Rabb pencipta langit dan bumi, Rabb segala sesuatu dan yang merajainya. Aku bersaksi bahwa tidak ada ilah yang berhak disembah kecuali Engkau. Aku berlindung kepadaMu dari kejahatan diriku, setan dan balatentaranya (godaan untuk berbuat syirik pada Allah), dan aku (berlindung kepada-Mu) dari berbuat kejelekan terhadap diriku atau menyeretnya kepada seorang muslim.\n" +
                        "\n" ,
                "Do’a ini diajarkan oleh Rasulullah shallallahu ‘alaihi wa sallam pada Abu Bakr Ash Shiddiq radhiyallahu ‘anhu untuk dibaca pada pagi, petang dan saat beranjak tidur.\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[11/20] Membaca Do'a Agar Terhindar dari Marabahaya(3x)",
                "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ\n" +
                        "\n" ,
                "Bismillahilladzi laa yadhurru ma’asmihi syai-un fil ardhi wa laa fis samaa’ wa huwas samii’ul ‘aliim.\n" +
                        "\n" ,
                "Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.\n" +
                        "\n" ,
                "Barangsiapa yang mengucapkan dzikir tersebut sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka tidak akan ada bahaya yang tiba-tiba memudaratkannya\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[12/20] Membaca Do'a Keridhaan(3x)",
                "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا\n" +
                        "\n" ,
                "Rodhiitu billaahi robbaa wa bil-islaami diinaa, wa bi-muhammadin shallallaahu ‘alaihi wa sallama nabiyya.\n" ,
                "Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.\n",
            "Barangsiapa yang mengucapkan dzikir ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.\n" +
                    "\n" ),
            DataPetang(
                "Dzikir Petang",
                "[13/20] Membaca Do'a Minta Pertolongan(1x)",
                "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا\n" +
                        "\n" ,
                "Yaa Hayyu Yaa Qoyyum, bi-rohmatika as-taghiits, wa ash-lih lii sya’nii kullahu wa laa takilnii ilaa nafsii thorfata ‘ainin Abadan\n" +
                        "\n" ,
                "Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).\n" +
                        "\n" ,
                "Dzikir ini diajarkan oleh Nabi shallallahu ‘alaihi wa sallam pada Fathimah supaya diamalkan pagi dan petang\n" +
                        "\n"),
            DataPetang(
                "Dzikir Petang",
                "[14/20] Membaca Do'a Fitrah(1x)",
                "أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ\n" +
                        "\n" ,
                "Ash-bahnaa ‘ala fithrotil islaam wa ‘alaa kalimatil ikhlaash, wa ‘alaa diini nabiyyinaa Muhammadin shallallahu ‘alaihi wa sallam, wa ‘alaa millati abiina Ibraahiima haniifam muslimaaw wa maa kaana minal musyrikin\n" +
                        "\n" ,
                "Di waktu pagi kami memegang agama Islam, kalimat ikhlas (kalimat syahadat), agama Nabi kami Muhammad shallallahu ‘alaihi wa sallam, dan agama bapak kami Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik\n" +
                        "\n" ,
                "HR. Muslim no. 2692.\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[15/20] Membaca Tahlil(1/10/100x)",
                "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ\n" +
                        "\n" ,
                "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodiir.\n" +
                        "\n" ,
                "Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah kerajaan dan segala pujian. Dia-lah yang berkuasa atas segala sesuatu.\n" +
                        "\n",
                "Barangsiapa yang mengucapkan dzikir tersebut dalam sehari sebanyak 100 x, maka itu seperti membebaskan 10 orang budak, dicatat baginya 100 kebaikan, dihapus baginya 100 kesalahan, dirinya akan terjaga dari gangguan setan dari pagi hingga petang hari, dan tidak ada seorang pun yang lebih baik dari yang ia lakukan kecuali oleh orang yang mengamalkan lebih dari itu.\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[16/20] Membaca Dzikir Pemberat Timbangan(3x)",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ: عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ\n" +
                        "\n" ,
                "Subhanallah wa bi-hamdih, ‘adada kholqih wa ridhoo nafsih. wa zinata ‘arsyih, wa midaada kalimaatih.\n" +
                        "\n",
                "“Maha Suci Allah, aku memujiNya sebanyak makhluk-Nya, sejauh kerelaan-Nya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimat-Nya.\n" +
                        "\n" ,
                "Nabi shallallahu ‘alaihi wa sallam mengatakan pada Juwairiyah bahwa dzikir di atas telah mengalahkan dzikir yang dibaca oleh Juwairiyah dari selepas Shubuh sampai waktu Dhuha\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[17/20] Membaca Do'a Mohon Ilmu dan Amal(1x)",
                "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً\n" +
                        "\n" ,
                "Allahumma innii as-aluka ‘ilman naafi’a, wa rizqon thoyyibaa, wa ‘amalan mutaqobbalaa.\n" +
                        "\n" ,
                "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik)\n" +
                        "\n" ,
                "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik)\n" +
                        "\n" ),

                DataPetang(
                    "Dzikir Petang",
                    "[18/20] Membaca Do'a Perlindungan dari Kejahatan Makhluk ",
                    "أَعُوْذُ بِكَلِمَاتِ اللهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ\n" ,
                    "A’udzu bikalimaatillahit-taammaati min syarri maa kholaq.\n" +
                            "\n" ,
                    "Aku berlindung dengan kalimat-kalimat Allah yang sempurna dari kejahatan makhluk yang diciptakanNya.\n" +
                            "\n" ,
                    "Siapa yang mengucapkannya di petang hari, niscaya tidak ada racun atau binatang (seperti: kalajengking) yang mencelakakannya di malam itu.\n" +
                            "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[19/20] Membaca Tasbih dan Tahmid(100x)",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ\n" +
                        "\n" ,
                "Subhaanallah wabihamdih",
                "Mahasuci Allah, aku memuji-Nya\n" +
                        "\n",
                "HR. Muslim no. 2691 dan no. 2692, dari Abu Hurairah radhiyallahu ‘anhu Syarah Muslim XVII / 17-18, Shahiih at-Targhiib wat Tarhiib 1/413 no. 653. Jumlah yang terbanyak dari dzikir-dzikir Nabi adalah seratus diwaktu pagi dan seratus diwaktu sore. Adapun riwayat yang menyebutkan sampai seribu adalah munkar, karena haditsnya dha’if. (Silsilah al-Ahaadiits adh-Dha-’iifah no. 5296).\n" +
                        "\n" ),

            DataPetang(
                "Dzikir Petang",
                "[20/20] Membaca Istigfar(100x)",
                "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ\n" +
                        "\n",
                "Astagh-firullah wa atuubu ilaih.\n" +
                        "\n" ,
                "Aku memohon ampun kepada Allah dan bertobat kepada-Nya.\n" +
                        "\n" ,
                "عَنِ ابْنِ عُمَرَ قَالَ:قَالَ رَسُو لُ اللهِ صلي الله عليه وسلم : يَااَيُّهَا النَّسُ، تُوبُواإِلَيْ اللهِ. فَإِنِّيْ اَتُوبُ فِيْ الْيَومِ إِلَيْهِ مِانَةً مَرَّةٍ Dari Ibnu ‘Umar ia berkata: “Rasulullah صلي الله عليه وسلم bersabda: ‘Wahai manusia, bertaubatlah kalian kepada Allah, sesungguhnya aku bertaubat kepada-Nya dalam sehari seratus kali.’” [HR. Muslim no. 2702 (42)].\n" +
                        "\n")
        )
    )


                override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_petang)
            petang.adapter = adapterPetang
        }

    }
