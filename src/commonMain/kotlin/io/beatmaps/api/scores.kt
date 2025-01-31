package io.beatmaps.api

import kotlinx.serialization.Serializable

@Serializable
data class LeaderboardData(val ranked: Boolean, val uid: Int, val scores: List<LeaderboardScore>, val mods: Boolean, val valid: Boolean)
@Serializable
data class LeaderboardScore(val playerId: Long, val name: String, val rank: Int, val score: Int, val pp: Double, val mods: List<String>)