/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.uiautomator2.server;

//@formatter:off

/**
 * An enumeration of status codes and messages to be relayed back to the Appium server.
 */
public enum WDStatus {
    SUCCESS(0, "The command executed successfully."),
    NO_SUCH_DRIVER(6, "A session is either terminated or not started"),
    NO_SUCH_ELEMENT(7, "An element could not be located on the page using the given search parameters."),
    NO_SUCH_FRAME(8, "A request to switch to a frame could not be satisfied because the frame could not be found."),
    UNKNOWN_COMMAND(9, "The requested resource could not be found, or a request was received using an HTTP method that is not supported by the mapped resource."),
    STALE_ELEMENT_REFERENCE(10, "An element command failed because the referenced element is no longer attached to the DOM."),
    ELEMENT_NOT_VISIBLE(11, "An element command could not be completed because the element is not visible on the page."),
    INVALID_ELEMENT_STATE(12, "An element command could not be completed because the element is in an invalid state (error.g. attempting to click a disabled element)."),
    UNKNOWN_ERROR(13, "An unknown server-side error occurred while processing the command."),
    ELEMENT_IS_NOT_SELECTABLE(15, "An attempt was made to select an element that cannot be selected."),
    JAVASCRIPT_ERROR(17, "An error occurred while executing user supplied JavaScript."),
    XPATH_LOOKUP_ERROR(19, "An error occurred while searching for an element by XPath."),
    TIMEOUT(21, "An operation did not complete before its timeout expired."),
    NO_SUCH_WINDOW(23, "A request to switch to a different window could not be satisfied because the window could not be found."),
    INVALID_COOKIE_DOMAIN(24, "An illegal attempt was made to set a cookie under a different domain than the current page."),
    UNABLE_TO_SET_COOKIE(25, "A request to set a cookie's value could not be satisfied."),
    UNEXPECTED_ALERT_OPEN(26, "A modal dialog was open, blocking this operation"),
    NO_ALERT_OPEN_ERROR(27, "An attempt was made to operate on a modal dialog when one was not open."),
    SCRIPT_TIMEOUT(28, "A script did not complete before its timeout expired."),
    INVALID_ELEMENT_COORDINATES(29, "The coordinates provided to an interactions operation are invalid."),
    IME_NOT_AVAILABLE(30, "IME was not available."),
    IME_ENGINE_ACTIVATION_FAILED(31, "An IME engine could not be started."),
    INVALID_SELECTOR(32, "Argument was an invalid selector (error.g. XPath/CSS)."),
    SESSION_NOT_CREATED_EXCEPTION(33, "A new session could not be created."),
    MOVE_TARGET_OUT_OF_BOUNDS(34, "Target provided for a move action is out of bounds."),
    JSON_DECODER_ERROR(35, "Could not decode action/params of command, please check format!");
    // formatter:on
    private final int statusCode;
    private final String statusMessage;

    WDStatus(final int code) {
        statusCode = code;
        statusMessage = "";
    }

    WDStatus(final int code, final String message) {
        statusCode = code;
        statusMessage = message;
    }

    public int code() {
        return statusCode;
    }

    public String message() {
        return statusMessage;
    }
}
