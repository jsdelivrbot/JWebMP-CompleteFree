(function($) {
    var cultures = Globalize.cultures,
        en = cultures.en,
        standard = en.calendars.standard,
        culture = cultures["gu"] = $.extend(true, {}, en, {
        name: "gu",
        englishName: "Gujarati",
        nativeName: "ગુજરાતી",
        language: "gu",
        numberFormat: {
            groupSizes: [3,2],
            percent: {
                groupSizes: [3,2]
            },
            currency: {
                pattern: ["$ -n","$ n"],
                groupSizes: [3,2],
                symbol: "રૂ"
            }
        },
        calendars: {
            standard: $.extend(true, {}, standard, {
                '/': "-",
                firstDay: 1,
                days: {
                    names: ["રવિવાર","સોમવાર","મંગળવાર","બુધવાર","ગુરુવાર","શુક્રવાર","શનિવાર"],
                    namesAbbr: ["રવિ","સોમ","મંગળ","બુધ","ગુરુ","શુક્ર","શનિ"],
                    namesShort: ["ર","સ","મ","બ","ગ","શ","શ"]
                },
                months: {
                    names: ["જાન્યુઆરી","ફેબ્રુઆરી","માર્ચ","એપ્રિલ","મે","જૂન","જુલાઈ","ઑગસ્ટ","સપ્ટેમ્બર","ઑક્ટ્બર","નવેમ્બર","ડિસેમ્બર",""],
                    namesAbbr: ["જાન્યુ","ફેબ્રુ","માર્ચ","એપ્રિલ","મે","જૂન","જુલાઈ","ઑગસ્ટ","સપ્ટે","ઑક્ટો","નવે","ડિસે",""]
                },
                AM: ["પૂર્વ મધ્યાહ્ન","પૂર્વ મધ્યાહ્ન","પૂર્વ મધ્યાહ્ન"],
                PM: ["ઉત્તર મધ્યાહ્ન","ઉત્તર મધ્યાહ્ન","ઉત્તર મધ્યાહ્ન"],
                patterns: {
                    d: "dd-MM-yy",
                    D: "dd MMMM yyyy",
                    t: "HH:mm",
                    T: "HH:mm:ss",
                    f: "dd MMMM yyyy HH:mm",
                    F: "dd MMMM yyyy HH:mm:ss",
                    M: "dd MMMM"
                }
            })
        }
    }, cultures["gu"]);
    culture.calendar = culture.calendars.standard;
})(jQuery);