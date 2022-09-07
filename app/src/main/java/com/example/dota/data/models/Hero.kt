package com.example.dota.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "heroes")
data class Hero(


    @SerializedName("id")
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Int? = null,

    @SerializedName("localized_name")
    @ColumnInfo(name = "name")
    var name: String? = null,

    @SerializedName("primary_attr")
    @ColumnInfo(name = "attribute")
    var attribute: String? = null,

    @SerializedName("attack_type")
    @ColumnInfo(name = "attack_type")
    var attackType: String? = null,

    @SerializedName("roles")
    @ColumnInfo(name = "roles")
    var roles: List<String> = listOf(),

    @SerializedName("img")
    @ColumnInfo(name = "img")
    var img: String? = null,

    @SerializedName("icon")
    @ColumnInfo(name = "icon")
    var icon: String? = null,

    @SerializedName("base_health")
    @ColumnInfo(name = "base_health")
    var baseHealth: Int? = null,

    @SerializedName("base_health_regen")
    @ColumnInfo(name = "base_health_regen")
    var baseHealthRegen: Double? = null,

    @SerializedName("base_mana")
    @ColumnInfo(name = "base_mana")
    var baseMana: Int? = null,

    @SerializedName("base_mana_regen")
    @ColumnInfo(name = "base_mana_regen")
    var baseManaRegen: Double? = null,

    @SerializedName("base_armor")
    @ColumnInfo(name = "base_armor")
    var baseArmor: Double? = null,

    @SerializedName("base_mr")
    @ColumnInfo(name = "base_mr")
    var baseMr: Int? = null,

    @SerializedName("base_attack_min")
    @ColumnInfo(name = "base_attack_min")
    var baseAttackMin: Int? = null,

    @SerializedName("base_attack_max")
    @ColumnInfo(name = "base_attack_max")
    var baseAttackMax: Int? = null,

    @SerializedName("base_str")
    @ColumnInfo(name = "base_str")
    var baseStr: Int? = null,

    @SerializedName("base_agi")
    @ColumnInfo(name = "base_agi")
    var baseAgi: Int? = null,

    @SerializedName("base_int")
    @ColumnInfo(name = "base_int")
    var baseInt: Int? = null,

    @SerializedName("str_gain")
    @ColumnInfo(name = "str_gain")
    var strGain: Double? = null,

    @SerializedName("agi_gain")
    @ColumnInfo(name = "agi_gain")
    var agiGain: Double? = null,

    @SerializedName("int_gain")
    @ColumnInfo(name = "int_gain")
    var intGain: Double? = null,

    @SerializedName("attack_range")
    @ColumnInfo(name = "attack_range")
    var attackRange: Int? = null,

    @SerializedName("projectile_speed")
    @ColumnInfo(name = "projectile_speed")
    var projectileSpeed: Int? = null,

    @SerializedName("attack_rate")
    @ColumnInfo(name = "attack_rate")
    var attackRate: Double? = null,

    @SerializedName("move_speed")
    @ColumnInfo(name = "move_speed")
    var moveSpeed: Int? = null,

    @SerializedName("turn_rate")
    @ColumnInfo(name = "turn_rate")
    var turnRate: Double? = null,

    @SerializedName("cm_enabled")
    @ColumnInfo(name = "cm_enabled")
    var cmEnabled: Boolean? = null,

    @SerializedName("hero_id")
    @ColumnInfo(name = "hero_id")
    var heroId: Int? = null,

    @SerializedName("turbo_picks")
    @ColumnInfo(name = "turbo_picks")
    var turboPicks: Int? = null,

    @SerializedName("turbo_wins")
    @ColumnInfo(name = "turbo_wins")
    var turboWins: Int? = null,

    @SerializedName("pro_ban")
    @ColumnInfo(name = "pro_ban")
    var proBan: Int? = null,

    @SerializedName("pro_win")
    @ColumnInfo(name = "pro_win")
    var proWin: Int? = null,

    @SerializedName("pro_pick")
    @ColumnInfo(name = "pro_pick")
    var proPick: Int? = null,

) : Serializable