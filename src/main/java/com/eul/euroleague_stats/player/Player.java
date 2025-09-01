package com.eul.euroleague_stats.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player_statistics")
public class Player {

    @Id
    @Column(name = "player_name")
    private String playerName;

    @Column(name = "team")
    private String team;

    @Column(name = "gp")
    private Integer gp;

    @Column(name = "gs")
    private Integer gs;

    @Column(name = "minutes")
    private Double minutes;

    @Column(name = "pts")
    private Double pts;

    @Column(name = "two_pm")
    private Double twoPm;

    @Column(name = "two_pa")
    private Double twoPa;

    @Column(name = "two_pct")
    private Double twoPct;

    @Column(name = "three_pm")
    private Double threePm;

    @Column(name = "three_pa")
    private Double threePa;

    @Column(name = "three_pct")
    private Double threePct;

    @Column(name = "ftm")
    private Double ftm;

    @Column(name = "fta")
    private Double fta;

    @Column(name = "ft_pct")
    private Double ftPct;

    @Column(name = "or_reb")
    private Double orReb;

    @Column(name = "dr_reb")
    private Double drReb;

    @Column(name = "tr_reb")
    private Double trReb;

    @Column(name = "ast")
    private Double ast;

    @Column(name = "stl")
    private Double stl;

    @Column(name = "turnover")
    private Double turnover;

    @Column(name = "blk")
    private Double blk;

    @Column(name = "blka")
    private Double blka;

    @Column(name = "fc")
    private Double fc;

    @Column(name = "fd")
    private Double fd;

    @Column(name = "pir")
    private Double pir;

    public Player(String playerName) {
        this.playerName = playerName;
    }

}
