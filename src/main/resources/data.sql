
-- here is the information that is inserted into the items table

INSERT INTO items (item_name, item_desc)
VALUES ('Map', 'A map of the Fog. Reveals various objectives.');

INSERT INTO items (item_name, item_desc)
VALUES ('Flashlight', 'A flashlight that can be used to blind the Killer.');

INSERT INTO items (item_name, item_desc)
VALUES ('Med-Kit', 'A medical kit that can be used to heal injured Survivors.');

INSERT INTO items (item_name, item_desc)
VALUES ('Toolbox', 'A toolbox that can be used to repair Generators faster.');

INSERT INTO items (item_name, item_desc)
VALUES ('Key', 'A skeleton key that can be used to open the Hatch and other special locks.');

INSERT INTO items (item_name, item_desc)
VALUES ('Firecracker', 'A firecracker that can be used to create a loud noise and blind the Killer.');

INSERT INTO items (item_name, item_desc)
VALUES ('Camping Aid Kit', 'A camping aid kit that can be used to heal injured Survivors.');

INSERT INTO items (item_name, item_desc)
VALUES ('First Aid Kit', 'A first aid kit that can be used to heal injured Survivors.');

INSERT INTO items (item_name, item_desc)
VALUES ('Emergency Med-Kit', 'An emergency medical kit that can be used to heal injured Survivors.');

INSERT INTO items (item_name, item_desc)
VALUES ('Mechanic Toolbox', 'A toolbox that can be used to repair Generators and other mechanical objects faster.');

-- here is the information that is inserted into the killers table

INSERT INTO killers (k_name, k_desc, power_name, power_desc, k_perk)
VALUES ('The Demogorgon','A monstrous killer from the Upside Down.','Shred', 'The Demogorgon can charge and unleash a powerful attack that tears through objects.','Surge');

INSERT INTO killers (k_name, k_desc, power_name, power_desc, k_perk)
VALUES ('The Skull Merchant', 'A self made millionaire that is able to place drones that detect and debilitate her targets','Eye in the Sky','The Skull Merchant relentlessly hunts her prey using the latest in surveillance technology','Game Afoot');

INSERT INTO killers (k_name, k_desc, power_name, power_desc, k_perk)
VALUES('The Trickster', 'A K-Pop idol turned murderer, he records the screams of his victims and mixes them into his new songs', 'Showstopper','A mesmerising skill honed through a lifetime of practice, Ji-Woon Hak unleashes a flurry of knives with rapid-fire speed.', 'Star Struck');

INSERT INTO killers (k_name, k_desc, power_name, power_desc, k_perk)
VALUES('The Executioner', 'A sadistic and  merciless executioner, Pyramid Head is fixated on dispensing punishment through pain.', 'Rites of Judgement', 'Open the Gates of Suffering and be judged! The Great Knife splits the ground, giving rise to an infernal construct and spreading agony to all who approach.', 'Trail of Torment');

INSERT INTO killers (k_name, k_desc, power_name, power_desc, k_perk)
VALUES('The Dredge','A twisted abomination manifested from the dark thoughts of a once vibrant community, it surrounds Survivors in darkness and appears to be everywhere at once.', 'Reign of Darkness','Throughout the match darkness will fall, allowing the Dredge to teleport between lockers throughout the map. Survivors will lose their vision as they hear the groans of your victims all around them.', 'Darkness Revealed');

-- here is the information that is inserted into the survivors table

INSERT INTO survivors(surv_name, surv_desc, surv_perk, image)
VALUES('Steve Harrington',
       'Popular and arrogant, yet compassionate, Steve Harrington is an unlikely mentor and leader. He often acts as a surrogate big brother to a younger boy named Dustin. He even helped him find his slimy inter-dimensional pet Demogorgon, D''Artagnan. His reputation as a protector grew and he soon became a sort of "babysitter" for a group of kids in Hawkins with a knack for messing around with strange and dangerous things. His courage is unmatched so that he was even able to fend off a Demogorgon when it threatened his friends. One evening he received a call for assistance from his friend Nancy Wheeler.He drove all the way to the Hawkins National Laboratory to see if she was okay. He searched the area but only found her notebook. Before he realised what was happening the ground opened up and a swirl of black mist filled his eyes. When he awakened he was in a strange place that seemed familiar but unfamiliar at the same time.',
       'Second Wind','https://pbs.twimg.com/media/E5uUSq2WQAEZvkm?format=jpg&name=900x900');

INSERT INTO survivors(surv_name, surv_desc, surv_perk, image)
VALUES ('Cheryl Mason','Caring and impulsive, Cheryl Mason, previously known as Heather, attempted to rebuild her life after the tragic death of her adoptive father, Harry Mason.

While she had freed herself from the religious cult that pursued her since birth, she was shackled by the guilt of her fathers death. A darkness punished her every night under the guise of abominable nightmares.

To ease her conscience, she volunteered at a crisis intervention centre for troubled youth. Three months later, she aced training and could answer the crisis line without supervision. Yet little could have prepared her for the first call. All she heard was static. The air thickened as black fumes rose from the ground and suddenly she heard the voice of a woman — someone she thought shed never hear from again.

Why do you cling to this corrupt world? You know that only God can save us.

It could not be her — Claudia was dead. Suddenly, the world spun and she dropped to her knees, nauseous. Hot bile travelled up her throat and she retched warm blood on the floor. Then the spinning stopped as swiftly as it began. Cheryl looked up and saw she was somewhere else. A cold, hopeless place.','Soul Guard',
        'https://cdn.vox-cdn.com/thumbor/1JAYrKeAIvNO1n44EV3TbXcqEvA=/0x0:1428x744/920x613/filters:focal(600x258:828x486):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/71546725/TtG2F5K.0.png');


INSERT INTO survivors(surv_name, surv_desc, surv_perk, image)
VALUES('Thalita Lyra','A competitive person that just wants to bring people together-- she came into The Fog with her brother,Renato','Cut loose','https://preview.redd.it/v198pr6fndia1.jpg?width=512&format=pjpg&auto=webp&v=enabled&s=d7fb3962fa7b6d936808f38152b8bbf970fcc8f5');

INSERT INTO survivors(surv_name, surv_desc, surv_perk,image)
VALUES('Renato Lyra','A kind hearted man who is adept at blending in to the background -- he came into The Fog with his sister Thalita.','Blood Rush','https://preview.redd.it/ecg5zr6fndia1.jpg?width=512&format=pjpg&auto=webp&v=enabled&s=1b455da19fde28b493cf5bfc28151d3249c8d2d3');

INSERT INTO survivors(surv_name, surv_desc, surv_perk,image)
VALUES('Mikaela Reid', 'A proud horror aficionado and admirer of the macabre, her supernatural touch has opened the door to new possibilities. Though some were initially wary, teammates quickly took to her alternative methods upon seeing the results.','Boon: Circle of Healing','https://cdna.artstation.com/p/assets/images/images/042/536/204/large/rafael-juarez-jr-mikaelathumbnail-render.jpg?1634761414');

-- here is the information that is inserted into the perks table

-- Demo's Perks
INSERT INTO perks(p_name, p_desc)
VALUES('Surge','Your eerie presence charges the air and interferes with technology.
When you put a SurvivorIconHelpLoading survivor.png into the Dying State with your Basic Attack, all Generators within 32 metres of you instantly explode and start regressing.

Applies an immediate 8 % Progression penalty.
Surge has a cool-down of 60/50/40 seconds.
"The creature appears to have some unknown influence over electricity and nearby electronics." — Hawkins National Laboratory'
);

INSERT INTO perks(p_name, p_desc)
VALUES('Cruel Limits','Your ties to the otherworldly manifest when your prey attempts to get away.
Whenever a Generator is completed, all Windows and Vault locations within 32 metres of it become blocked for all Survivors for the next 20/25/30 seconds.
The Auras of the blocked Vault locations are revealed to you for the duration.
"The specimen seems to be able to affect the state of nearby objects, as if they existed in some other form within a dimension alternate to our own." — Hawkins National Laboratory');

INSERT INTO perks(p_name, p_desc)
VALUES('Mindbreaker','Your distressing presence drains and weakens your prey.
Whenever a Survivor is repairing a Generator, they suffer from the Exhausted Status Effect.

If the Survivor is already Exhausted, their Status Effects timer will be paused.
The Status Effect lingers for 3/4/5 seconds after the Survivor stops repairing.
"The specimens apparent telepathic ability can evoke feelings of dread and fatigue in nearby individuals." — Hawkins National Laboratory');

-- Skull Merchant perks

INSERT INTO perks(p_name, p_desc)
VALUES('THWACK!','Your prey is terrified by your relentless pursuit.
After hooking a Survivor, THWACK! activates for the next 45/60/75 seconds:

The next time you break a Breakable Wall or a Pallet, all Survivors within 32 metres of your location will scream and reveal their Aura for 4 seconds.
"All those who stood in her path feared her mighty THWACK!" — Sonhadores Sombrios, Issue #3');

INSERT INTO perks(p_name, p_desc)
VALUES('Leverage', 'Like in business, you profit most when those around you suffer most.
Each time you hook a Survivor, Leverage activates and gains 1 Token, up to a maximum of 10 Tokens:

For each Token, the Healing speed of Survivors is reduced by a stack-able 3/4/5 % for the next 30 seconds, up to a maximum of 30/40/50 %.
"The best way to raise profit is to cut expenditures. Cut everything!" — Adriana Imai');

INSERT INTO perks(p_name, p_desc)
VALUES('Game Afoot','First you pick your prey, then you pick it apart.
While you are chasing the Obsession, Game Afoot activates:

Whenever you hit the Survivor with the total most time in Chase with a Basic Attack, they become the Obsession.
Grants a 5 % Haste Status Effect for 8/9/10 seconds after damaging a Generator or breaking a Breakable Wall or Pallet.
You can only be obsessed with one Survivor at a time.

"All those who stood in her path feared her mighty THWACK!" — Sonhadores Sombrios, Issue #3');

-- Trickster perks
INSERT INTO perks(p_name, p_desc)
VALUES('Starstruck','Your unmatched showmanship dazzles all.
When carrying a Survivor, Starstruck activates:

Survivors suffer from the Exposed Status Effect while in your Terror Radius.
The Status Effect lingers for 26/28/30 seconds after leaving your Terror Radius.
After hooking or dropping the carried Survivor, Starstruck deactivates:

The Status Effect persists for 26/28/30 seconds for any Survivor inside your Terror Radius at that moment.
Starstruck has a cool-down of 60 seconds once the Survivor is no longer being carried.

"Enjoy this moment, few get so close." — Ji-Woon Hak');

INSERT INTO perks(p_name, p_desc)
VALUES('Hex:Crowd Control','A Hex that ensures those lesser than you are properly herded.
Survivors who perform a rushed vault through a Window prompt The Entity to block it for the next 14/17/20 seconds.
The Hex effects persist until its Hex Totem is cleansed.
"You have no control. People like you never did." — Ji-Woon Hak');

INSERT INTO perks(p_name, p_desc)
VALUES('No Way Out','You are not going to let just anyone into the VIP room.
For each Survivor you hook for the first time, No Way Out gains 1 Token.
Once the Exit Gates have been powered, No Way Out activates:

When a Survivor interacts with an Exit Gate Switch, you receive a Loud Noise Notification and The Entity blocks both Exit Gate Switches for 12 seconds and an additional 6/9/12 seconds per Token in your possession, up to a combined maximum of 36/48/60 seconds.
"That sound when you bleed... let me hear it again." — Ji-Woon Hak');

-- Pyramid Head's Perks

INSERT INTO perks(p_name, p_desc)
VALUES('Forced Penance','Those who stand in the way of duty will suffer harsh judgement.
Survivors who take a Protection Hit suffer from the Broken Status Effect for the next 60/70/80 seconds.');

INSERT INTO perks(p_name, p_desc)
VALUES('Trail of Torment','You guide your victims along a path of pain and punishment.
Performing the Damage Generator Action on a Generator activates Trail of Torment:

Grants the Undetectable Status Effect until the Generator stops regressing or a Survivor is damaged by any means.
The Aura of the damaged Generator is revealed to all Survivors in yellow.
Trail of Torment has a cool-down of 80/70/60 seconds.');

INSERT INTO perks(p_name, p_desc)
VALUES('Deathbound','Those whose lives are intertwined in darkness are destined to suffer together.
When a Survivor heals another Survivor for the equivalent of 1 Health State at least 32 metres away from you, that Survivor will scream, revealing their location and activating Deathbound:

For the next 60 seconds, that Survivor suffers from the Oblivious Status Effect when farther than 16/12/8 metres away from the healed Survivor.');

-- Dredge perks

INSERT INTO perks(p_name, p_desc)
VALUES('Dissolution','Everything turns to dust. It is as inescapable as the coming of the night.
3 seconds after injuring a Survivor by any means, Dissolution activates for 12/16/20 seconds:

While Dissolution is active, if a Survivor fast vaults over a Pallet while they are inside your Terror Radius, The Entity will break the Pallet at the end of the vault, deactivating Dissolution.
"The Garden shall be a place of perfect Joy; through Joy, nothing shall stand in our way." — Otto Stamper');

INSERT INTO perks(p_name, p_desc)
VALUES('Darkness Revealed','In your presence, places once thought to be safe are perhaps the most dangerous.
When you search a Locker, the Auras of all Survivors within 8 metres of any Locker are revealed to you for 3/4/5 seconds.
Darkness Revealed has a cool-down of 30 seconds.
"Stay in the light, my children. In darkness, your fear will expose you." — Otto Stamper');

INSERT INTO perks(p_name, p_desc)
VALUES('Septic Touch','The Land of the Shadows subsumes all. Healing only delays the inevitable.
Whenever a Survivor performs a Healing action while they are inside your Terror Radius, that Survivor suffers from the Blindness and Exhausted Status Effects
These effects linger for 6/8/10 seconds after the Healing action is interrupted by any means.
"Do not admit to fear, or pain, or doubt. These are the seeds from which darkness grows." — Otto Stamper');


-- END KILLER PERKS

-- SURVIVOR PERKS START

-- Steve's Perks
INSERT INTO perks(p_name, p_desc)
VALUES('Babysitter', 'While you have a reputation for being self-centred, you risk it all to help those in need.
When you unhook a Survivor, the rescued Survivor will leave neither Scratch Marks nor Pools of Blood for the next 4/6/8 seconds.

Both you and the Killer see each others Aura for 4 seconds.
"I promised to keep you shitheads safe, and thats exactly what I plan on doing." — Steve Harrington');

INSERT INTO perks(p_name, p_desc)
VALUES('Camaraderie','Life has taught you the importance of friendship which has given you strength.
While you are on the Hook in the Struggle Phase, Camaraderie activates:

If another Survivor is within 16 metres of your Hook while Camaraderie is active, the Struggle Phase timer is paused for 26/30/34 seconds.
"So, remember once you get in there... pretend like you dont care. There you go, youre learning my friend. Youre learning." — Steve Harrington');

INSERT INTO perks(p_name, p_desc)
VALUES('Second Wind','You have learnt to avoid awkward situations with parents.
Part of you still thinks your best option is to run away and hope things will take care of themselves.
When you heal another Survivor for the equivalent of 1 Health State, Second Wind activates:

The next time you are unhooked or unhook yourself, you suffer from the Broken Status Effect until Second Wind deactivates.
You are automatically healed 1 Health State after 28/24/20 seconds.
While Second Wind is active, the following conditions will deactivate it:

Successfully being healed by Second Wind.
Being put into the Dying State before the timer elapses.
Second Wind does not activate if you already suffer from the Broken Status Effect.
"Yeah, that''s a no." — Steve Harrington');

-- Cheryl's Perks

INSERT INTO perks(p_name, p_desc)
VALUES('Soul Guard','You have been through immense hardship and youre stronger for it.
After being healed from or having recovered from the Dying State, Soul Guard grants you the Endurance Status Effect for the next 4/6/8 seconds.

Any damage taken that would put you into the Dying State will instead trigger the Deep Wound Status Effect, after which you have 20 seconds to Mend yourself.
Taking any damage while under the effect of Deep Wound or if its timer runs out will put you into the Dying State.
Soul Guard allows you to completely recover from the Dying State when you are affected by the Cursed Status Effect.
Soul Guard has a cool-down of 30 seconds.');


INSERT INTO perks(p_name, p_desc)
VALUES('Blood Pact','
It is as if a latent part of yourself has awakened.
You feel like you can reach out beyond yourself for assistance.

When you or the Obsession are injured, you both see each others Auras.

After healing the Obsession or being healed by the Obsession, you both gain the Haste Status Effect, moving at an increased speed of 5/6/7 % until you are no longer within 16 metres of each other.
If you are the Obsession, Blood Pact deactivates.
Lowers the odds of becoming the Killers initial Obsession by -100 %.

The Killer can only be obsessed with Survivor at a time.');

INSERT INTO perks(p_name, p_desc)
VALUES('Repressed Alliance','You are accustomed to being hunted by malicious forces, and you have begun using it to your advantage.
After repairing Generators for a total of 55/50/45 seconds, Repressed Alliance activates:

Press the Active Ability button to call upon The Entity to block the Generator you are currently repairing for 30 seconds, after which Repressed Alliance deactivates.
The Aura of the blocked Generator is revealed to all Survivors in white.
Repressed Alliance can only be triggered when no other Survivors are repairing your Generator');

-- Thalita's Perks

INSERT INTO perks(p_name, p_desc)
VALUES('Friendly Competition','You revel in the community spirit of a competition, and inspire others to follow suit.
Whenever you complete a Generator with at least one other Survivor, Friendly Competition activates:

Increases your Repair speed, and that of the other Survivor(s) who completed the repairs with you, by +5 % for the next 45/60/75 seconds.
"C''mon, let''s do this!" — Thalita Lyra');


INSERT INTO perks(p_name, p_desc)
VALUES('Teamwork: Power of Two','It is hard to keep up with you, but it does not stop people from trying.
Whenever you finish healing another Survivor, Teamwork: Power of Two activates and both you and the healed Survivor benefit from the following effect:

Grants a 5 % Haste Status Effect for as long as you stay within 12 metres of one another or one of you loses a Health State.
Teamwork: Power of Two has a cool-down of 180/160/140 seconds.

Survivors can only be affected by one instance of Teamwork: Power of Two at a time.

"You good? Then keep up!" — Thalita Lyra');

INSERT INTO perks(p_name, p_desc)
VALUES('Cut Loose','You get in enough trouble, you know how to get out of it.
After performing a rushed vault in a Chase, Cut Loose activates for the next 4/5/6 seconds:

Suppresses both the Loud Noise Notification and the sound effects triggered by rushing to vault.
Successfully performing a rushed vault while Cut Loose is active resets the timer.
Cut Loose has a cool-down of 45 seconds.

"I know how we can get out of here! Quick, this way!" — Thalita Lyra');

INSERT INTO perks(p_name, p_desc)
VALUES('Background Player','You are not usually the centre of attention and in some cases, this can be a good thing.
After unhooking another Survivor, break into a sprint at 150 % of your normal Running Movement speed for 6 seconds.

Background Player causes the Exhausted Status Effect for 60/50/40 seconds.

Background Player cannot be used when Exhausted.

"You forget about me?" — Renato Lyra');

INSERT INTO perks(p_name, p_desc)
VALUES('Blood Rush','Your mind and body are honed for great feats, allowing you to push through with extra effort when necessary.
Once you are one Hook away from instant death, Blood Rush activates:

Press the Active Ability button to lose a Health State and instantly recover from the Exhausted Status Effect.
Causes the Broken Status Effect for 28/24/20 seconds, while you are automatically healing back to Healthy.
Cancels the healing effect upon taking damage.
Blood Rush is disabled for the remainder of the Trial after use.

"Just gotta... push through!" — Renato Lyra');


INSERT INTO perks(p_name, p_desc)
VALUES('Teamwork: Collective Stealth','When someone helps you out, you respond in kind.
Whenever another Survivor finishes healing you, Teamwork: Collective Stealth activates and both you and the Survivor who healed you benefit from the following effect:

Suppresses your Scratch Marks for as long as you stay within 12 metres of one another or one of you loses a Health State.
Teamwork: Collective Stealth has a cool-down of 180/160/140 seconds.

Survivors can only be affected by one instance of Teamwork: Collective Stealth at a time.

"Im good, Im good... but keep it down." — Renato Lyra');



-- Mikaela's perks

INSERT INTO perks(p_name,p_desc)
VALUES('Clairvoyance','
There is an intrinsic energy in you that sees beyond your vision.
Whenever you cleanse a Totem, Clairvoyance activates:

When empty-handed, press and hold the Ability button to unlock your full Aura-reading potential, allowing you to see the Auras of the Exit Gate Switches, Generators, Hooks, Chests, and the Hatch within 64 metres for 8/9/10 seconds.
"Does anyone else see that? Just me?" — Mikaela Reid');

INSERT INTO perks(p_name,p_desc)
VALUES('Boon: Circle of Healing','A Boon that offers comfort amidst the terror.
Press and hold the Active Ability button near a Dull or Hex Totem to bless it and create a Boon Totem.
Soft chimes ring out within a radius of 24 metres.

Survivors inside the Boon Totem''s range benefit from the following effects:

Increases all Healing speeds by 40/45/50 %.
Unlocks the Self-Care ability, allowing you to self-heal without needing a Med-Kit at 50 % of the normal Healing speed.
Boon: Circle of Healing benefits from its own effect.

Survivors can only be affected by one instance of Boon: Circle of Healing at a time.

You can only bless one Totem at a time.
All equipped Boon Perks are active on the same Boon Totem.

"Try this, it is better than anything you will find in a pharmacy." — Mikaela Reid');

INSERT INTO perks(p_name,p_desc)
VALUES('Boon: Shadow Step','A Boon that conceals the truth.
Press and hold the Active Ability button near a Dull or Hex Totem to bless it and create a Boon Totem.
Soft chimes ring out within a radius of 24 metres.

Survivors inside the Boon Totems range benefit from the following effects:

Scratch Marks are suppressed.
Auras are hidden from The Killer.
Both effects linger for 2/3/4 seconds after leaving the Boon Totems range.
You can only bless one Totem at a time.
All equipped Boon Perks are active on the same Boon Totem.
"Stick to the shadows and cover your tracks." — Mikaela Reid');