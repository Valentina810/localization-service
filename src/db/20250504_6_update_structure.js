use('localization-db');

const locales = ["ru", "en", "fr", "it", "zh", "ja"];

locales.forEach(locale => {
    const doc = db.localization.findOne({ locale: locale });

    if (doc && doc.screens && !Array.isArray(doc.screens)) {
        const screensObject = doc.screens;
        const screensArray = Object.keys(screensObject).map(screenName => {
            return {
                screen: screenName,
                elements: screensObject[screenName]
            };
        });

        db.localization.updateOne(
            { _id: doc._id },
            { $set: { screens: screensArray } }
        );

        print(`Документ для локали '${locale}' успешно обновлён в новый формат.`);
    } else {
        print(`Пропущено: документ для локали '${locale}' уже в новом формате или не найден.`);
    }
});
