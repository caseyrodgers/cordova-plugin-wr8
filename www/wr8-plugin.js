/*global cordova, module*/
module.exports = {
    /** simply echo back arguments
    */
    echo: function (arg, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Wr8", "echo", [arg]);
    },
    /** initialize the dongle */
    init: function (arg, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Wr8", "init", [arg]);
    },

};
