package edu.kcc.repository;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

import edu.kcc.utils.Constants;


public class CountryRepository implements ICountryRepository {

    Logger logger = Logger.getLogger(CountryRepository.class.getName());

    // change this code to pull from the database
    @Override
    public List<String> getAllCountryCodes() {
        logger.info("Getting all country codes");

        return List.of("USA", "CA", "MEX");
    }
}
