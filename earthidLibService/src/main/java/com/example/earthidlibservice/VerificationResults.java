package com.example.earthidlibservice;

import com.google.gson.annotations.SerializedName;

public class VerificationResults {
    @SerializedName("status")
    private String status;

    @SerializedName("verification")
    private Verification verification;


    public String getStatus() {
        return status;
    }

    public Verification getVerification() {
        return verification;
    }



    public static class Verification {
        @SerializedName("id")
        private String id;

        @SerializedName("code")
        private int code;

        @SerializedName("person")
        private Person person;

        @SerializedName("reason")
        private String reason;

        @SerializedName("status")
        private String status;

        @SerializedName("comments")
        private String[] comments;

        @SerializedName("document")
        private Document document;

        @SerializedName("reasonCode")
        private String reasonCode;

        @SerializedName("vendorData")
        private String vendorData;

        @SerializedName("decisionTime")
        private String decisionTime;

        @SerializedName("acceptanceTime")
        private String acceptanceTime;

        @SerializedName("additionalVerifiedData")
        private Object additionalVerifiedData;

        public String getId() {
            return id;
        }

        public int getCode() {
            return code;
        }

        public Person getPerson() {
            return person;
        }

        public String getReason() {
            return reason;
        }

        public String getStatus() {
            return status;
        }

        public String[] getComments() {
            return comments;
        }

        public Document getDocument() {
            return document;
        }

        public String getReasonCode() {
            return reasonCode;
        }

        public String getVendorData() {
            return vendorData;
        }

        public String getDecisionTime() {
            return decisionTime;
        }

        public String getAcceptanceTime() {
            return acceptanceTime;
        }

        public Object getAdditionalVerifiedData() {
            return additionalVerifiedData;
        }
    }

    public static class Person {
        @SerializedName("gender")
        private String gender;

        @SerializedName("idNumber")
        private String idNumber;

        @SerializedName("lastName")
        private String lastName;

        @SerializedName("firstName")
        private String firstName;

        @SerializedName("citizenship")
        private String citizenship;

        @SerializedName("dateOfBirth")
        private String dateOfBirth;

        @SerializedName("nationality")
        private String nationality;

        @SerializedName("yearOfBirth")
        private String yearOfBirth;

        @SerializedName("placeOfBirth")
        private String placeOfBirth;

        @SerializedName("pepSanctionMatch")
        private String pepSanctionMatch;

        public String getGender() {
            return gender;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getCitizenship() {
            return citizenship;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getNationality() {
            return nationality;
        }

        public String getYearOfBirth() {
            return yearOfBirth;
        }

        public String getPlaceOfBirth() {
            return placeOfBirth;
        }

        public String getPepSanctionMatch() {
            return pepSanctionMatch;
        }
    }

    public static class Document {
        @SerializedName("type")
        private String type;

        @SerializedName("number")
        private String number;

        @SerializedName("country")
        private String country;

        @SerializedName("validFrom")
        private String validFrom;

        @SerializedName("validUntil")
        private String validUntil;
    }
}
