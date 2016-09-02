package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by trevorjargon on 8/30/16.
 */
public class PetsContract {

    private PetsContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * One class us3
     */
    public static final class PetEntry implements BaseColumns {

        /**
         * Below are all listed values of the pets table.
         */
        public final static String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Below are all listed possibilities for pet gender
         */
        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
    }

}
