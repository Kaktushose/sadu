/*
 *     SPDX-License-Identifier: AGPL-3.0-only
 *
 *     Copyright (C) 2022 RainbowDashLabs and Contributor
 */

package de.chojo.sadu.types;

import static de.chojo.sadu.types.SqlType.ofName;

public interface MariaDbTypes {
    /**
     * Fixed < 255 with padding
     */
    SqlType CHAR = ofName("CHAR");

    /**
     * < 65,353 Bytes
     */
    SqlType VARCHAR = ofName("VARCHAR");

    /**
     * < 255 Bytes
     */
    SqlType TINYTEXT = ofName("TINYTEXT");
    /**
     * < 65,353 Bytes
     */
    SqlType TEXT = ofName("TEXT");
    /**
     * < 16,777,215 Bytes
     */
    SqlType MEDIUMTEXT = ofName("MEDIUMTEXT");
    /**
     * < 4,294,967,295 Bytes
     */
    SqlType LONGTEXT = ofName("LONGTEXT");

    /**
     * -128 and 127
     */
    SqlType TINYINT = ofName("TINYINT");
    /**
     * -32,768 and 32,767
     */
    SqlType SMALLINT = ofName("SMALLINT");
    /**
     * -8,288,608 and 8,388,607
     */
    SqlType MEDIUMINT = ofName("MEDIUMINT");
    /**
     * -2,147,483,648 and 2,147,483,647
     */
    SqlType INT = ofName("INT");
    /**
     * "Unlimited"
     */
    SqlType BIGINT = ofName("BIGINT");

    /**
     * exact fixed point
     */
    SqlType DECIMAL = ofName("DECIMAL");
    /**
     * double precision
     */
    SqlType DOUBLE = ofName("DOUBLE");
    /**
     * single precision
     */
    SqlType FLOAT = ofName("FLOAT");

    /**
     * Boolean representation
     */
    SqlType BOOLEAN = ofName("BOOLEAN");

    /**
     * Fixed < 255 with padding
     */
    SqlType BINARY = ofName("BINARY");
    /**
     * < 65,353 Bytes
     */
    SqlType VARBINARY = ofName("VARBINARY");

    /**
     * < 255 Bytes
     */
    SqlType TINYBLOB = ofName("TINYBLOB");
    /**
     * < 65,353
     */
    SqlType BLOB = ofName("BLOB");
    /**
     * < 16,777,215 Bytes
     */
    SqlType MEDIUMBLOB = ofName("MEDIUMBLOB");
    /**
     * < 4,294,967,295
     */
    SqlType LONGBLOB = ofName("LONGBLOB");

    SqlType DATE = ofName("DATE");
    SqlType TIME = ofName("TIME");
    SqlType TIMESTAMP = ofName("TIMESTAMP");

}
