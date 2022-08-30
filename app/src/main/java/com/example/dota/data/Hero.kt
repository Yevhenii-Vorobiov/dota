package com.example.dota.data

import com.google.gson.annotations.SerializedName

data class Hero(

    @SerializedName("id") var id: Int? = null,
//    @SerializedName("name") var name: String? = null,
    @SerializedName("localized_name") var name: String? = null,
    @SerializedName("primary_attr") var attribute: String? = null,
    @SerializedName("attack_type") var attackType: String? = null,
    @SerializedName("roles") var roles: List<String> = listOf(),
    @SerializedName("img") var img: String? = null,
    @SerializedName("icon") var icon: String? = null,
    @SerializedName("base_health") var baseHealth: Int? = null,
    @SerializedName("base_health_regen") var baseHealthRegen: Double? = null,
    @SerializedName("base_mana") var baseMana: Int? = null,
    @SerializedName("base_mana_regen") var baseManaRegen: Double? = null,
    @SerializedName("base_armor") var baseArmor: Double? = null,
    @SerializedName("base_mr") var baseMr: Int? = null,
    @SerializedName("base_attack_min") var baseAttackMin: Int? = null,
    @SerializedName("base_attack_max") var baseAttackMax: Int? = null,
    @SerializedName("base_str") var baseStr: Int? = null,
    @SerializedName("base_agi") var baseAgi: Int? = null,
    @SerializedName("base_int") var baseInt: Int? = null,
    @SerializedName("str_gain") var strGain: Double? = null,
    @SerializedName("agi_gain") var agiGain: Double? = null,
    @SerializedName("int_gain") var intGain: Double? = null,
    @SerializedName("attack_range") var attackRange: Int? = null,
    @SerializedName("projectile_speed") var projectileSpeed: Int? = null,
    @SerializedName("attack_rate") var attackRate: Double? = null,
    @SerializedName("move_speed") var moveSpeed: Int? = null,
    @SerializedName("turn_rate") var turnRate: Double? = null,
    @SerializedName("cm_enabled") var cmEnabled: Boolean? = null,
    @SerializedName("legs") var legs: Int? = null,
    @SerializedName("hero_id") var heroId: Int? = null,
    @SerializedName("turbo_picks") var turboPicks: Int? = null,
    @SerializedName("turbo_wins") var turboWins: Int? = null,
    @SerializedName("pro_ban") var proBan: Int? = null,
    @SerializedName("pro_win") var proWin: Int? = null,
    @SerializedName("pro_pick") var proPick: Int? = null,

    )