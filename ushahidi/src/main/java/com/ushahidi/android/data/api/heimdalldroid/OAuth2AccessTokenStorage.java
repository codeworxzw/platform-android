package com.ushahidi.android.data.api.heimdalldroid;

import rx.Observable;

/**
 * Interface used to define how to store and retrieve a stored access token.
 *
 * @param <TAccessToken> The access token type.
 */
public interface OAuth2AccessTokenStorage<TAccessToken extends OAuth2AccessToken> {

    // Public API

    /**
     * Queries the stored access token.
     *
     * @return - An Observable emitting the stored access token.
     */
    Observable<TAccessToken> getStoredAccessToken();

    /**
     * Stores the given access token.
     *
     * @param token The access token which will be stored.
     */
    void storeAccessToken(TAccessToken token);

    /**
     * Checks whether there is or is not an access token
     *
     * @return - An Observable emitting true or false based on whether there is or is not an
     * access token.
     */
    Observable<Boolean> hasAccessToken();

    /**
     * Removes the stored access token.
     */
    void removeAccessToken();
}
