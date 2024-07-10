package edu.kcc.repository;

import edu.kcc.entity.CountryLanguage;

import java.util.List;
import java.util.logging.Logger;



public class CountryLanguageRepository implements ICountryLanguageRepository {

    Logger logger = Logger.getLogger(CountryLanguageRepository.class.getName());


    // Check this method so that it pulls from the database
    @Override
    public List<CountryLanguage> getLanguagesForCountryCode(String code) {
        logger.info(String.format("Getting languages for %s", code));

        return List.of(new CountryLanguage("USA", "English", false, 95.0),
                new CountryLanguage("USA", "Spanish", false, 5.0));
    }
}
