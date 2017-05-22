/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Company;
import pojo.Stock;
import java.util.*;

import java.io.File;
import java.io.IOException;

/**
 * Utility class to validate input JSON files
 */
public class InputValidator {
    public ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @return List of Stocks which are read from the file
     */
    public List<Stock> getStocks() throws IOException {
        File file2 = new File("services/src/main/resources/data/historicalStockData.json");
        this.checkFile(file2);
        List<Stock> stockList = new ArrayList<>();
        return objectMapper.readValue(file2, stockList.getClass());
    }

    /**
     * @return List of Companies read from the file
     */
    public List<Company> getCompanies() throws IOException {
        File file = new File("services/src/main/resources/data/companyInfo.json");
        this.checkFile(file);
        return objectMapper.readValue(file, new TypeReference<List<Company>>(){});
    }

    /**
     * Check if a file is readable and validates files
     */
    private boolean checkFile(File file){
        return ((file.canRead()) && (file != null) &&(file.exists()));
    }
}
