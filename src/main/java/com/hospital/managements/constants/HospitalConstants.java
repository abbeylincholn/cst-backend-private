package com.hospital.managements.constants;

public class HospitalConstants {

    private HospitalConstants() {
        // restrict instantiation  // cos i dont want anyone to create an instance of this class
    }
    // === HTTP STATUS CODES ===
    public static final String STATUS_200 = "200";
    public static final String STATUS_201 = "201";
    public static final String STATUS_400 = "400";
    public static final String STATUS_404 = "404";
    public static final String STATUS_417 = "417";
    public static final String STATUS_500 = "500";

    // === SUCCESS MESSAGES ===
    public static final String MESSAGE_200 = "Request processed successfully";
    public static final String MESSAGE_201 = "Record created successfully";

    // === ERROR MESSAGES ===
    public static final String MESSAGE_400 = "Invalid request data";
    public static final String MESSAGE_404 = "Requested resource not found";
    public static final String MESSAGE_417_UPDATE = "Update operation failed. Please try again or contact support";
    public static final String MESSAGE_417_DELETE = "Delete operation failed. Please try again or contact support";
    public static final String MESSAGE_500 = "An internal error occurred. Please try again or contact admin";

    // === DEFAULT/EXAMPLE VALUES ===
    public static final String DEFAULT_ADDRESS = "123 Main Street, New York";
    public static final String DEFAULT_PHONE = "08012345678";

    // === ENUM-LIKE CONSTANTS ===
    public static final String STATUS_ACTIVE = "active";
    public static final String STATUS_INACTIVE = "inactive";

    public static final String APPOINTMENT_STATUS_SCHEDULED = "Scheduled";
    public static final String APPOINTMENT_STATUS_COMPLETED = "Completed";
    public static final String APPOINTMENT_STATUS_CANCELLED = "Cancelled";

    // === VALIDATION MESSAGES (for @NotEmpty or @Pattern annotations) ===
    public static final String MSG_REQUIRED_FIELD = "This field is required";
    public static final String MSG_INVALID_EMAIL = "Invalid email format";
    public static final String MSG_INVALID_PHONE = "Phone number must be 11 digits";

}
