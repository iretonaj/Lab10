class Cookie {
  int numCookies;
  int bakeTemp;
  int bakeTime;
  boolean isReady;

  Cookie() {
    numCookies = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int aNumCookies, int aBakeTemp, int aBakeTime) {
    numCookies = aNumCookies;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  boolean getIsReady() {
    return isReady;
  }

  void setNumCookies(int aNumCookies){
    numCookies = aNumCookies;
  }

  void bakeCookies (int aBakeTemp, int aBakeTime) {
    System.out.println("The cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady = true;
  }
}