package dev.protrack.uitestapp

class HttpAuthService: AuthService  {
    override fun fetchUser(): String {
        return "Real User"
    }
}