package com.passwordping.client;

/**
 * Response object for Accounts API call - internal use only
 */
class AccountsResponse {

    /**
     * The salt value to use for credentials hashes for this account
     * @return
     */
    public String getSalt() {
        return salt;
    }

    /**
     * The list of password hashes required to be calculated when checking credentials for this account
     * @return
     */
    public PasswordHashSpecification[] getPasswordHashesRequired() {
        return passwordHashesRequired;
    }

    private String salt = "";
    private PasswordHashSpecification[] passwordHashesRequired = new PasswordHashSpecification[0];
}
